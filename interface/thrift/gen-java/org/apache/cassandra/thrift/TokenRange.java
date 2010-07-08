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
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

public class TokenRange implements TBase<TokenRange._Fields>, java.io.Serializable, Cloneable, Comparable<TokenRange> {
  private static final TStruct STRUCT_DESC = new TStruct("TokenRange");

  private static final TField START_TOKEN_FIELD_DESC = new TField("start_token", TType.STRING, (short)1);
  private static final TField END_TOKEN_FIELD_DESC = new TField("end_token", TType.STRING, (short)2);
  private static final TField ENDPOINTS_FIELD_DESC = new TField("endpoints", TType.LIST, (short)3);

  public String start_token;
  public String end_token;
  public List<String> endpoints;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    START_TOKEN((short)1, "start_token"),
    END_TOKEN((short)2, "end_token"),
    ENDPOINTS((short)3, "endpoints");

    private static final Map<Integer, _Fields> byId = new HashMap<Integer, _Fields>();
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byId.put((int)field._thriftId, field);
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      return byId.get(fieldId);
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

  public static final Map<_Fields, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new EnumMap<_Fields, FieldMetaData>(_Fields.class) {{
    put(_Fields.START_TOKEN, new FieldMetaData("start_token", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.END_TOKEN, new FieldMetaData("end_token", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.ENDPOINTS, new FieldMetaData("endpoints", TFieldRequirementType.REQUIRED, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(TokenRange.class, metaDataMap);
  }

  public TokenRange() {
  }

  public TokenRange(
    String start_token,
    String end_token,
    List<String> endpoints)
  {
    this();
    this.start_token = start_token;
    this.end_token = end_token;
    this.endpoints = endpoints;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TokenRange(TokenRange other) {
    if (other.isSetStart_token()) {
      this.start_token = other.start_token;
    }
    if (other.isSetEnd_token()) {
      this.end_token = other.end_token;
    }
    if (other.isSetEndpoints()) {
      List<String> __this__endpoints = new ArrayList<String>();
      for (String other_element : other.endpoints) {
        __this__endpoints.add(other_element);
      }
      this.endpoints = __this__endpoints;
    }
  }

  public TokenRange deepCopy() {
    return new TokenRange(this);
  }

  @Deprecated
  public TokenRange clone() {
    return new TokenRange(this);
  }

  public String getStart_token() {
    return this.start_token;
  }

  public TokenRange setStart_token(String start_token) {
    this.start_token = start_token;
    return this;
  }

  public void unsetStart_token() {
    this.start_token = null;
  }

  /** Returns true if field start_token is set (has been asigned a value) and false otherwise */
  public boolean isSetStart_token() {
    return this.start_token != null;
  }

  public void setStart_tokenIsSet(boolean value) {
    if (!value) {
      this.start_token = null;
    }
  }

  public String getEnd_token() {
    return this.end_token;
  }

  public TokenRange setEnd_token(String end_token) {
    this.end_token = end_token;
    return this;
  }

  public void unsetEnd_token() {
    this.end_token = null;
  }

  /** Returns true if field end_token is set (has been asigned a value) and false otherwise */
  public boolean isSetEnd_token() {
    return this.end_token != null;
  }

  public void setEnd_tokenIsSet(boolean value) {
    if (!value) {
      this.end_token = null;
    }
  }

  public int getEndpointsSize() {
    return (this.endpoints == null) ? 0 : this.endpoints.size();
  }

  public java.util.Iterator<String> getEndpointsIterator() {
    return (this.endpoints == null) ? null : this.endpoints.iterator();
  }

  public void addToEndpoints(String elem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<String>();
    }
    this.endpoints.add(elem);
  }

  public List<String> getEndpoints() {
    return this.endpoints;
  }

  public TokenRange setEndpoints(List<String> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public void unsetEndpoints() {
    this.endpoints = null;
  }

  /** Returns true if field endpoints is set (has been asigned a value) and false otherwise */
  public boolean isSetEndpoints() {
    return this.endpoints != null;
  }

  public void setEndpointsIsSet(boolean value) {
    if (!value) {
      this.endpoints = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case START_TOKEN:
      if (value == null) {
        unsetStart_token();
      } else {
        setStart_token((String)value);
      }
      break;

    case END_TOKEN:
      if (value == null) {
        unsetEnd_token();
      } else {
        setEnd_token((String)value);
      }
      break;

    case ENDPOINTS:
      if (value == null) {
        unsetEndpoints();
      } else {
        setEndpoints((List<String>)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case START_TOKEN:
      return getStart_token();

    case END_TOKEN:
      return getEnd_token();

    case ENDPOINTS:
      return getEndpoints();

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case START_TOKEN:
      return isSetStart_token();
    case END_TOKEN:
      return isSetEnd_token();
    case ENDPOINTS:
      return isSetEndpoints();
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
    if (that instanceof TokenRange)
      return this.equals((TokenRange)that);
    return false;
  }

  public boolean equals(TokenRange that) {
    if (that == null)
      return false;

    boolean this_present_start_token = true && this.isSetStart_token();
    boolean that_present_start_token = true && that.isSetStart_token();
    if (this_present_start_token || that_present_start_token) {
      if (!(this_present_start_token && that_present_start_token))
        return false;
      if (!this.start_token.equals(that.start_token))
        return false;
    }

    boolean this_present_end_token = true && this.isSetEnd_token();
    boolean that_present_end_token = true && that.isSetEnd_token();
    if (this_present_end_token || that_present_end_token) {
      if (!(this_present_end_token && that_present_end_token))
        return false;
      if (!this.end_token.equals(that.end_token))
        return false;
    }

    boolean this_present_endpoints = true && this.isSetEndpoints();
    boolean that_present_endpoints = true && that.isSetEndpoints();
    if (this_present_endpoints || that_present_endpoints) {
      if (!(this_present_endpoints && that_present_endpoints))
        return false;
      if (!this.endpoints.equals(that.endpoints))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TokenRange other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TokenRange typedOther = (TokenRange)other;

    lastComparison = Boolean.valueOf(isSetStart_token()).compareTo(typedOther.isSetStart_token());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart_token()) {      lastComparison = TBaseHelper.compareTo(start_token, typedOther.start_token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEnd_token()).compareTo(typedOther.isSetEnd_token());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnd_token()) {      lastComparison = TBaseHelper.compareTo(end_token, typedOther.end_token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndpoints()).compareTo(typedOther.isSetEndpoints());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndpoints()) {      lastComparison = TBaseHelper.compareTo(endpoints, typedOther.endpoints);
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
        case 1: // START_TOKEN
          if (field.type == TType.STRING) {
            this.start_token = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // END_TOKEN
          if (field.type == TType.STRING) {
            this.end_token = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // ENDPOINTS
          if (field.type == TType.LIST) {
            {
              TList _list24 = iprot.readListBegin();
              this.endpoints = new ArrayList<String>(_list24.size);
              for (int _i25 = 0; _i25 < _list24.size; ++_i25)
              {
                String _elem26;
                _elem26 = iprot.readString();
                this.endpoints.add(_elem26);
              }
              iprot.readListEnd();
            }
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
    if (this.start_token != null) {
      oprot.writeFieldBegin(START_TOKEN_FIELD_DESC);
      oprot.writeString(this.start_token);
      oprot.writeFieldEnd();
    }
    if (this.end_token != null) {
      oprot.writeFieldBegin(END_TOKEN_FIELD_DESC);
      oprot.writeString(this.end_token);
      oprot.writeFieldEnd();
    }
    if (this.endpoints != null) {
      oprot.writeFieldBegin(ENDPOINTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.endpoints.size()));
        for (String _iter27 : this.endpoints)
        {
          oprot.writeString(_iter27);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TokenRange(");
    boolean first = true;

    sb.append("start_token:");
    if (this.start_token == null) {
      sb.append("null");
    } else {
      sb.append(this.start_token);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("end_token:");
    if (this.end_token == null) {
      sb.append("null");
    } else {
      sb.append(this.end_token);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("endpoints:");
    if (this.endpoints == null) {
      sb.append("null");
    } else {
      sb.append(this.endpoints);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (start_token == null) {
      throw new TProtocolException("Required field 'start_token' was not present! Struct: " + toString());
    }
    if (end_token == null) {
      throw new TProtocolException("Required field 'end_token' was not present! Struct: " + toString());
    }
    if (endpoints == null) {
      throw new TProtocolException("Required field 'endpoints' was not present! Struct: " + toString());
    }
  }

}

