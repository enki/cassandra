/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.cassandra.thrift;
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


import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class RowPredicate implements TBase<RowPredicate, RowPredicate._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("RowPredicate");

  private static final TField KEYS_FIELD_DESC = new TField("keys", TType.LIST, (short)1);
  private static final TField KEY_RANGE_FIELD_DESC = new TField("key_range", TType.STRUCT, (short)2);
  private static final TField INDEX_CLAUSE_FIELD_DESC = new TField("index_clause", TType.STRUCT, (short)3);

  public List<byte[]> keys;
  public KeyRange key_range;
  public IndexClause index_clause;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    KEYS((short)1, "keys"),
    KEY_RANGE((short)2, "key_range"),
    INDEX_CLAUSE((short)3, "index_clause");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // KEYS
          return KEYS;
        case 2: // KEY_RANGE
          return KEY_RANGE;
        case 3: // INDEX_CLAUSE
          return INDEX_CLAUSE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEYS, new FieldMetaData("keys", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    tmpMap.put(_Fields.KEY_RANGE, new FieldMetaData("key_range", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, KeyRange.class)));
    tmpMap.put(_Fields.INDEX_CLAUSE, new FieldMetaData("index_clause", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, IndexClause.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(RowPredicate.class, metaDataMap);
  }

  public RowPredicate() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RowPredicate(RowPredicate other) {
    if (other.isSetKeys()) {
      List<byte[]> __this__keys = new ArrayList<byte[]>();
      for (byte[] other_element : other.keys) {
        byte[] temp_binary_element = new byte[other_element.length];
        System.arraycopy(other_element, 0, temp_binary_element, 0, other_element.length);
        __this__keys.add(temp_binary_element);
      }
      this.keys = __this__keys;
    }
    if (other.isSetKey_range()) {
      this.key_range = new KeyRange(other.key_range);
    }
    if (other.isSetIndex_clause()) {
      this.index_clause = new IndexClause(other.index_clause);
    }
  }

  public RowPredicate deepCopy() {
    return new RowPredicate(this);
  }

  @Deprecated
  public RowPredicate clone() {
    return new RowPredicate(this);
  }

  public int getKeysSize() {
    return (this.keys == null) ? 0 : this.keys.size();
  }

  public java.util.Iterator<byte[]> getKeysIterator() {
    return (this.keys == null) ? null : this.keys.iterator();
  }

  public void addToKeys(byte[] elem) {
    if (this.keys == null) {
      this.keys = new ArrayList<byte[]>();
    }
    this.keys.add(elem);
  }

  public List<byte[]> getKeys() {
    return this.keys;
  }

  public RowPredicate setKeys(List<byte[]> keys) {
    this.keys = keys;
    return this;
  }

  public void unsetKeys() {
    this.keys = null;
  }

  /** Returns true if field keys is set (has been asigned a value) and false otherwise */
  public boolean isSetKeys() {
    return this.keys != null;
  }

  public void setKeysIsSet(boolean value) {
    if (!value) {
      this.keys = null;
    }
  }

  public KeyRange getKey_range() {
    return this.key_range;
  }

  public RowPredicate setKey_range(KeyRange key_range) {
    this.key_range = key_range;
    return this;
  }

  public void unsetKey_range() {
    this.key_range = null;
  }

  /** Returns true if field key_range is set (has been asigned a value) and false otherwise */
  public boolean isSetKey_range() {
    return this.key_range != null;
  }

  public void setKey_rangeIsSet(boolean value) {
    if (!value) {
      this.key_range = null;
    }
  }

  public IndexClause getIndex_clause() {
    return this.index_clause;
  }

  public RowPredicate setIndex_clause(IndexClause index_clause) {
    this.index_clause = index_clause;
    return this;
  }

  public void unsetIndex_clause() {
    this.index_clause = null;
  }

  /** Returns true if field index_clause is set (has been asigned a value) and false otherwise */
  public boolean isSetIndex_clause() {
    return this.index_clause != null;
  }

  public void setIndex_clauseIsSet(boolean value) {
    if (!value) {
      this.index_clause = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case KEYS:
      if (value == null) {
        unsetKeys();
      } else {
        setKeys((List<byte[]>)value);
      }
      break;

    case KEY_RANGE:
      if (value == null) {
        unsetKey_range();
      } else {
        setKey_range((KeyRange)value);
      }
      break;

    case INDEX_CLAUSE:
      if (value == null) {
        unsetIndex_clause();
      } else {
        setIndex_clause((IndexClause)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case KEYS:
      return getKeys();

    case KEY_RANGE:
      return getKey_range();

    case INDEX_CLAUSE:
      return getIndex_clause();

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case KEYS:
      return isSetKeys();
    case KEY_RANGE:
      return isSetKey_range();
    case INDEX_CLAUSE:
      return isSetIndex_clause();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RowPredicate)
      return this.equals((RowPredicate)that);
    return false;
  }

  public boolean equals(RowPredicate that) {
    if (that == null)
      return false;

    boolean this_present_keys = true && this.isSetKeys();
    boolean that_present_keys = true && that.isSetKeys();
    if (this_present_keys || that_present_keys) {
      if (!(this_present_keys && that_present_keys))
        return false;
      if (!this.keys.equals(that.keys))
        return false;
    }

    boolean this_present_key_range = true && this.isSetKey_range();
    boolean that_present_key_range = true && that.isSetKey_range();
    if (this_present_key_range || that_present_key_range) {
      if (!(this_present_key_range && that_present_key_range))
        return false;
      if (!this.key_range.equals(that.key_range))
        return false;
    }

    boolean this_present_index_clause = true && this.isSetIndex_clause();
    boolean that_present_index_clause = true && that.isSetIndex_clause();
    if (this_present_index_clause || that_present_index_clause) {
      if (!(this_present_index_clause && that_present_index_clause))
        return false;
      if (!this.index_clause.equals(that.index_clause))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(RowPredicate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    RowPredicate typedOther = (RowPredicate)other;

    lastComparison = Boolean.valueOf(isSetKeys()).compareTo(typedOther.isSetKeys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeys()) {      lastComparison = TBaseHelper.compareTo(this.keys, typedOther.keys);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKey_range()).compareTo(typedOther.isSetKey_range());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey_range()) {      lastComparison = TBaseHelper.compareTo(this.key_range, typedOther.key_range);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIndex_clause()).compareTo(typedOther.isSetIndex_clause());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndex_clause()) {      lastComparison = TBaseHelper.compareTo(this.index_clause, typedOther.index_clause);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // KEYS
          if (field.type == TType.LIST) {
            {
              TList _list12 = iprot.readListBegin();
              this.keys = new ArrayList<byte[]>(_list12.size);
              for (int _i13 = 0; _i13 < _list12.size; ++_i13)
              {
                byte[] _elem14;
                _elem14 = iprot.readBinary();
                this.keys.add(_elem14);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // KEY_RANGE
          if (field.type == TType.STRUCT) {
            this.key_range = new KeyRange();
            this.key_range.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // INDEX_CLAUSE
          if (field.type == TType.STRUCT) {
            this.index_clause = new IndexClause();
            this.index_clause.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.keys != null) {
      if (isSetKeys()) {
        oprot.writeFieldBegin(KEYS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.keys.size()));
          for (byte[] _iter15 : this.keys)
          {
            oprot.writeBinary(_iter15);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.key_range != null) {
      if (isSetKey_range()) {
        oprot.writeFieldBegin(KEY_RANGE_FIELD_DESC);
        this.key_range.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (this.index_clause != null) {
      if (isSetIndex_clause()) {
        oprot.writeFieldBegin(INDEX_CLAUSE_FIELD_DESC);
        this.index_clause.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RowPredicate(");
    boolean first = true;

    if (isSetKeys()) {
      sb.append("keys:");
      if (this.keys == null) {
        sb.append("null");
      } else {
        sb.append(this.keys);
      }
      first = false;
    }
    if (isSetKey_range()) {
      if (!first) sb.append(", ");
      sb.append("key_range:");
      if (this.key_range == null) {
        sb.append("null");
      } else {
        sb.append(this.key_range);
      }
      first = false;
    }
    if (isSetIndex_clause()) {
      if (!first) sb.append(", ");
      sb.append("index_clause:");
      if (this.index_clause == null) {
        sb.append("null");
      } else {
        sb.append(this.index_clause);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

