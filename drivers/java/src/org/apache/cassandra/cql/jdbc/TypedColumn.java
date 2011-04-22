package org.apache.cassandra.cql.jdbc;
/*
 * 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * 
 */


import org.apache.cassandra.db.marshal.AbstractType;

import java.nio.ByteBuffer;

class TypedColumn<N, V>
{
    private final N name;
    private final V value;
    
    // we cache the string versions of the byte buffers here.  It turns out that {N|V}.toString() isn't always the same
    // (a good example is byte buffers) as the stringified versions supplied by the AbstractTypes.
    private final String nameString;
    private final String valueString;
    private final AbstractType<V> validator;
    
    public TypedColumn(AbstractType<N> comparator, byte[] name, AbstractType<V> validator, byte[] value)
    {
        ByteBuffer bbName = ByteBuffer.wrap(name);
        ByteBuffer bbValue = value == null ? null : ByteBuffer.wrap(value);
        this.name = comparator.compose(bbName);
        this.value = value == null ? null : validator.compose(bbValue);
        nameString = comparator.getString(bbName);
        valueString = value == null ? null : validator.getString(bbValue);
        this.validator = validator;
    }
    
    public N getName()
    {
        return name;
    }
    
    public V getValue()
    {
        return value;
    }
    
    public String getNameString()
    {
        return nameString;
    }
    
    public String getValueString()
    {
        return valueString;
    }
    
    public AbstractType<V> getValidator()
    {
        return validator;
    }
}
