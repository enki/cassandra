package org.apache.cassandra.db.marshal;
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


import java.util.UUID;
import org.apache.cassandra.utils.FBUtilities;

public class TimeUUIDType extends AbstractType
{
    public static final TimeUUIDType instance = new TimeUUIDType();

    TimeUUIDType() {} // singleton

    public int compare(byte[] o1, byte[] o2)
    {
        if (o1.length == 0)
        {
            return o2.length == 0 ? 0 : -1;
        }
        if (o2.length == 0)
        {
            return 1;
        }
        
        long t1 = getTimestamp(o1);
        long t2 = getTimestamp(o2);
        return t1 < t2 ? -1 : (t1 > t2 ? 1 : FBUtilities.compareByteArrays(o1, o2));
    }

    static long getTimestamp(byte[] bytes)
    {
        long low = 0;
        int mid = 0;
        int hi = 0;

        for (int i = 0; i < 4; i++)
            low = (low << 8) | (bytes[i] & 0xff);
        for (int i = 4; i < 6; i++)
            mid = (mid << 8) | (bytes[i] & 0xff);
        for (int i = 6; i < 8; i++)
            hi = (hi << 8) | (bytes[i] & 0xff);

        return low + ((long)mid << 32) + ((long)(hi & 0x0FFF) << 48);
    }

    public String getString(byte[] bytes)
    {
        if (bytes.length == 0)
        {
            return "";
        }
        if (bytes.length != 16)
        {
            throw new MarshalException("UUIDs must be exactly 16 bytes");
        }
        UUID uuid = LexicalUUIDType.getUUID(bytes);
        if (uuid.version() != 1)
        {
            throw new MarshalException("TimeUUID only makes sense with version 1 UUIDs");
        }
        return uuid.toString();
    }
}
