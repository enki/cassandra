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

public class CfDef implements TBase<CfDef._Fields>, java.io.Serializable, Cloneable, Comparable<CfDef> {
  private static final TStruct STRUCT_DESC = new TStruct("CfDef");

  private static final TField TABLE_FIELD_DESC = new TField("table", TType.STRING, (short)1);
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)2);
  private static final TField COLUMN_TYPE_FIELD_DESC = new TField("column_type", TType.STRING, (short)3);
  private static final TField CLOCK_TYPE_FIELD_DESC = new TField("clock_type", TType.STRING, (short)4);
  private static final TField COMPARATOR_TYPE_FIELD_DESC = new TField("comparator_type", TType.STRING, (short)5);
  private static final TField SUBCOMPARATOR_TYPE_FIELD_DESC = new TField("subcomparator_type", TType.STRING, (short)6);
  private static final TField RECONCILER_FIELD_DESC = new TField("reconciler", TType.STRING, (short)7);
  private static final TField COMMENT_FIELD_DESC = new TField("comment", TType.STRING, (short)8);
  private static final TField ROW_CACHE_SIZE_FIELD_DESC = new TField("row_cache_size", TType.DOUBLE, (short)9);
  private static final TField PRELOAD_ROW_CACHE_FIELD_DESC = new TField("preload_row_cache", TType.BOOL, (short)10);
  private static final TField KEY_CACHE_SIZE_FIELD_DESC = new TField("key_cache_size", TType.DOUBLE, (short)11);
  private static final TField READ_REPAIR_CHANCE_FIELD_DESC = new TField("read_repair_chance", TType.DOUBLE, (short)12);

  public String table;
  public String name;
  public String column_type;
  public String clock_type;
  public String comparator_type;
  public String subcomparator_type;
  public String reconciler;
  public String comment;
  public double row_cache_size;
  public boolean preload_row_cache;
  public double key_cache_size;
  public double read_repair_chance;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    TABLE((short)1, "table"),
    NAME((short)2, "name"),
    COLUMN_TYPE((short)3, "column_type"),
    CLOCK_TYPE((short)4, "clock_type"),
    COMPARATOR_TYPE((short)5, "comparator_type"),
    SUBCOMPARATOR_TYPE((short)6, "subcomparator_type"),
    RECONCILER((short)7, "reconciler"),
    COMMENT((short)8, "comment"),
    ROW_CACHE_SIZE((short)9, "row_cache_size"),
    PRELOAD_ROW_CACHE((short)10, "preload_row_cache"),
    KEY_CACHE_SIZE((short)11, "key_cache_size"),
    READ_REPAIR_CHANCE((short)12, "read_repair_chance");

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
  private static final int __ROW_CACHE_SIZE_ISSET_ID = 0;
  private static final int __PRELOAD_ROW_CACHE_ISSET_ID = 1;
  private static final int __KEY_CACHE_SIZE_ISSET_ID = 2;
  private static final int __READ_REPAIR_CHANCE_ISSET_ID = 3;
  private BitSet __isset_bit_vector = new BitSet(4);

  public static final Map<_Fields, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new EnumMap<_Fields, FieldMetaData>(_Fields.class) {{
    put(_Fields.TABLE, new FieldMetaData("table", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.COLUMN_TYPE, new FieldMetaData("column_type", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.CLOCK_TYPE, new FieldMetaData("clock_type", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.COMPARATOR_TYPE, new FieldMetaData("comparator_type", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.SUBCOMPARATOR_TYPE, new FieldMetaData("subcomparator_type", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.RECONCILER, new FieldMetaData("reconciler", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.COMMENT, new FieldMetaData("comment", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.ROW_CACHE_SIZE, new FieldMetaData("row_cache_size", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.DOUBLE)));
    put(_Fields.PRELOAD_ROW_CACHE, new FieldMetaData("preload_row_cache", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    put(_Fields.KEY_CACHE_SIZE, new FieldMetaData("key_cache_size", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.DOUBLE)));
    put(_Fields.READ_REPAIR_CHANCE, new FieldMetaData("read_repair_chance", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.DOUBLE)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(CfDef.class, metaDataMap);
  }

  public CfDef() {
    this.column_type = "Standard";

    this.clock_type = "Timestamp";

    this.comparator_type = "BytesType";

    this.subcomparator_type = "";

    this.reconciler = "";

    this.comment = "";

    this.row_cache_size = (double)0;

    this.preload_row_cache = false;

    this.key_cache_size = (double)200000;

    this.read_repair_chance = 1;

  }

  public CfDef(
    String table,
    String name)
  {
    this();
    this.table = table;
    this.name = name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CfDef(CfDef other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetTable()) {
      this.table = other.table;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetColumn_type()) {
      this.column_type = other.column_type;
    }
    if (other.isSetClock_type()) {
      this.clock_type = other.clock_type;
    }
    if (other.isSetComparator_type()) {
      this.comparator_type = other.comparator_type;
    }
    if (other.isSetSubcomparator_type()) {
      this.subcomparator_type = other.subcomparator_type;
    }
    if (other.isSetReconciler()) {
      this.reconciler = other.reconciler;
    }
    if (other.isSetComment()) {
      this.comment = other.comment;
    }
    this.row_cache_size = other.row_cache_size;
    this.preload_row_cache = other.preload_row_cache;
    this.key_cache_size = other.key_cache_size;
    this.read_repair_chance = other.read_repair_chance;
  }

  public CfDef deepCopy() {
    return new CfDef(this);
  }

  @Deprecated
  public CfDef clone() {
    return new CfDef(this);
  }

  public String getTable() {
    return this.table;
  }

  public CfDef setTable(String table) {
    this.table = table;
    return this;
  }

  public void unsetTable() {
    this.table = null;
  }

  /** Returns true if field table is set (has been asigned a value) and false otherwise */
  public boolean isSetTable() {
    return this.table != null;
  }

  public void setTableIsSet(boolean value) {
    if (!value) {
      this.table = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public CfDef setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been asigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getColumn_type() {
    return this.column_type;
  }

  public CfDef setColumn_type(String column_type) {
    this.column_type = column_type;
    return this;
  }

  public void unsetColumn_type() {
    this.column_type = null;
  }

  /** Returns true if field column_type is set (has been asigned a value) and false otherwise */
  public boolean isSetColumn_type() {
    return this.column_type != null;
  }

  public void setColumn_typeIsSet(boolean value) {
    if (!value) {
      this.column_type = null;
    }
  }

  public String getClock_type() {
    return this.clock_type;
  }

  public CfDef setClock_type(String clock_type) {
    this.clock_type = clock_type;
    return this;
  }

  public void unsetClock_type() {
    this.clock_type = null;
  }

  /** Returns true if field clock_type is set (has been asigned a value) and false otherwise */
  public boolean isSetClock_type() {
    return this.clock_type != null;
  }

  public void setClock_typeIsSet(boolean value) {
    if (!value) {
      this.clock_type = null;
    }
  }

  public String getComparator_type() {
    return this.comparator_type;
  }

  public CfDef setComparator_type(String comparator_type) {
    this.comparator_type = comparator_type;
    return this;
  }

  public void unsetComparator_type() {
    this.comparator_type = null;
  }

  /** Returns true if field comparator_type is set (has been asigned a value) and false otherwise */
  public boolean isSetComparator_type() {
    return this.comparator_type != null;
  }

  public void setComparator_typeIsSet(boolean value) {
    if (!value) {
      this.comparator_type = null;
    }
  }

  public String getSubcomparator_type() {
    return this.subcomparator_type;
  }

  public CfDef setSubcomparator_type(String subcomparator_type) {
    this.subcomparator_type = subcomparator_type;
    return this;
  }

  public void unsetSubcomparator_type() {
    this.subcomparator_type = null;
  }

  /** Returns true if field subcomparator_type is set (has been asigned a value) and false otherwise */
  public boolean isSetSubcomparator_type() {
    return this.subcomparator_type != null;
  }

  public void setSubcomparator_typeIsSet(boolean value) {
    if (!value) {
      this.subcomparator_type = null;
    }
  }

  public String getReconciler() {
    return this.reconciler;
  }

  public CfDef setReconciler(String reconciler) {
    this.reconciler = reconciler;
    return this;
  }

  public void unsetReconciler() {
    this.reconciler = null;
  }

  /** Returns true if field reconciler is set (has been asigned a value) and false otherwise */
  public boolean isSetReconciler() {
    return this.reconciler != null;
  }

  public void setReconcilerIsSet(boolean value) {
    if (!value) {
      this.reconciler = null;
    }
  }

  public String getComment() {
    return this.comment;
  }

  public CfDef setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public void unsetComment() {
    this.comment = null;
  }

  /** Returns true if field comment is set (has been asigned a value) and false otherwise */
  public boolean isSetComment() {
    return this.comment != null;
  }

  public void setCommentIsSet(boolean value) {
    if (!value) {
      this.comment = null;
    }
  }

  public double getRow_cache_size() {
    return this.row_cache_size;
  }

  public CfDef setRow_cache_size(double row_cache_size) {
    this.row_cache_size = row_cache_size;
    setRow_cache_sizeIsSet(true);
    return this;
  }

  public void unsetRow_cache_size() {
    __isset_bit_vector.clear(__ROW_CACHE_SIZE_ISSET_ID);
  }

  /** Returns true if field row_cache_size is set (has been asigned a value) and false otherwise */
  public boolean isSetRow_cache_size() {
    return __isset_bit_vector.get(__ROW_CACHE_SIZE_ISSET_ID);
  }

  public void setRow_cache_sizeIsSet(boolean value) {
    __isset_bit_vector.set(__ROW_CACHE_SIZE_ISSET_ID, value);
  }

  public boolean isPreload_row_cache() {
    return this.preload_row_cache;
  }

  public CfDef setPreload_row_cache(boolean preload_row_cache) {
    this.preload_row_cache = preload_row_cache;
    setPreload_row_cacheIsSet(true);
    return this;
  }

  public void unsetPreload_row_cache() {
    __isset_bit_vector.clear(__PRELOAD_ROW_CACHE_ISSET_ID);
  }

  /** Returns true if field preload_row_cache is set (has been asigned a value) and false otherwise */
  public boolean isSetPreload_row_cache() {
    return __isset_bit_vector.get(__PRELOAD_ROW_CACHE_ISSET_ID);
  }

  public void setPreload_row_cacheIsSet(boolean value) {
    __isset_bit_vector.set(__PRELOAD_ROW_CACHE_ISSET_ID, value);
  }

  public double getKey_cache_size() {
    return this.key_cache_size;
  }

  public CfDef setKey_cache_size(double key_cache_size) {
    this.key_cache_size = key_cache_size;
    setKey_cache_sizeIsSet(true);
    return this;
  }

  public void unsetKey_cache_size() {
    __isset_bit_vector.clear(__KEY_CACHE_SIZE_ISSET_ID);
  }

  /** Returns true if field key_cache_size is set (has been asigned a value) and false otherwise */
  public boolean isSetKey_cache_size() {
    return __isset_bit_vector.get(__KEY_CACHE_SIZE_ISSET_ID);
  }

  public void setKey_cache_sizeIsSet(boolean value) {
    __isset_bit_vector.set(__KEY_CACHE_SIZE_ISSET_ID, value);
  }

  public double getRead_repair_chance() {
    return this.read_repair_chance;
  }

  public CfDef setRead_repair_chance(double read_repair_chance) {
    this.read_repair_chance = read_repair_chance;
    setRead_repair_chanceIsSet(true);
    return this;
  }

  public void unsetRead_repair_chance() {
    __isset_bit_vector.clear(__READ_REPAIR_CHANCE_ISSET_ID);
  }

  /** Returns true if field read_repair_chance is set (has been asigned a value) and false otherwise */
  public boolean isSetRead_repair_chance() {
    return __isset_bit_vector.get(__READ_REPAIR_CHANCE_ISSET_ID);
  }

  public void setRead_repair_chanceIsSet(boolean value) {
    __isset_bit_vector.set(__READ_REPAIR_CHANCE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLE:
      if (value == null) {
        unsetTable();
      } else {
        setTable((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case COLUMN_TYPE:
      if (value == null) {
        unsetColumn_type();
      } else {
        setColumn_type((String)value);
      }
      break;

    case CLOCK_TYPE:
      if (value == null) {
        unsetClock_type();
      } else {
        setClock_type((String)value);
      }
      break;

    case COMPARATOR_TYPE:
      if (value == null) {
        unsetComparator_type();
      } else {
        setComparator_type((String)value);
      }
      break;

    case SUBCOMPARATOR_TYPE:
      if (value == null) {
        unsetSubcomparator_type();
      } else {
        setSubcomparator_type((String)value);
      }
      break;

    case RECONCILER:
      if (value == null) {
        unsetReconciler();
      } else {
        setReconciler((String)value);
      }
      break;

    case COMMENT:
      if (value == null) {
        unsetComment();
      } else {
        setComment((String)value);
      }
      break;

    case ROW_CACHE_SIZE:
      if (value == null) {
        unsetRow_cache_size();
      } else {
        setRow_cache_size((Double)value);
      }
      break;

    case PRELOAD_ROW_CACHE:
      if (value == null) {
        unsetPreload_row_cache();
      } else {
        setPreload_row_cache((Boolean)value);
      }
      break;

    case KEY_CACHE_SIZE:
      if (value == null) {
        unsetKey_cache_size();
      } else {
        setKey_cache_size((Double)value);
      }
      break;

    case READ_REPAIR_CHANCE:
      if (value == null) {
        unsetRead_repair_chance();
      } else {
        setRead_repair_chance((Double)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE:
      return getTable();

    case NAME:
      return getName();

    case COLUMN_TYPE:
      return getColumn_type();

    case CLOCK_TYPE:
      return getClock_type();

    case COMPARATOR_TYPE:
      return getComparator_type();

    case SUBCOMPARATOR_TYPE:
      return getSubcomparator_type();

    case RECONCILER:
      return getReconciler();

    case COMMENT:
      return getComment();

    case ROW_CACHE_SIZE:
      return new Double(getRow_cache_size());

    case PRELOAD_ROW_CACHE:
      return new Boolean(isPreload_row_cache());

    case KEY_CACHE_SIZE:
      return new Double(getKey_cache_size());

    case READ_REPAIR_CHANCE:
      return new Double(getRead_repair_chance());

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case TABLE:
      return isSetTable();
    case NAME:
      return isSetName();
    case COLUMN_TYPE:
      return isSetColumn_type();
    case CLOCK_TYPE:
      return isSetClock_type();
    case COMPARATOR_TYPE:
      return isSetComparator_type();
    case SUBCOMPARATOR_TYPE:
      return isSetSubcomparator_type();
    case RECONCILER:
      return isSetReconciler();
    case COMMENT:
      return isSetComment();
    case ROW_CACHE_SIZE:
      return isSetRow_cache_size();
    case PRELOAD_ROW_CACHE:
      return isSetPreload_row_cache();
    case KEY_CACHE_SIZE:
      return isSetKey_cache_size();
    case READ_REPAIR_CHANCE:
      return isSetRead_repair_chance();
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
    if (that instanceof CfDef)
      return this.equals((CfDef)that);
    return false;
  }

  public boolean equals(CfDef that) {
    if (that == null)
      return false;

    boolean this_present_table = true && this.isSetTable();
    boolean that_present_table = true && that.isSetTable();
    if (this_present_table || that_present_table) {
      if (!(this_present_table && that_present_table))
        return false;
      if (!this.table.equals(that.table))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_column_type = true && this.isSetColumn_type();
    boolean that_present_column_type = true && that.isSetColumn_type();
    if (this_present_column_type || that_present_column_type) {
      if (!(this_present_column_type && that_present_column_type))
        return false;
      if (!this.column_type.equals(that.column_type))
        return false;
    }

    boolean this_present_clock_type = true && this.isSetClock_type();
    boolean that_present_clock_type = true && that.isSetClock_type();
    if (this_present_clock_type || that_present_clock_type) {
      if (!(this_present_clock_type && that_present_clock_type))
        return false;
      if (!this.clock_type.equals(that.clock_type))
        return false;
    }

    boolean this_present_comparator_type = true && this.isSetComparator_type();
    boolean that_present_comparator_type = true && that.isSetComparator_type();
    if (this_present_comparator_type || that_present_comparator_type) {
      if (!(this_present_comparator_type && that_present_comparator_type))
        return false;
      if (!this.comparator_type.equals(that.comparator_type))
        return false;
    }

    boolean this_present_subcomparator_type = true && this.isSetSubcomparator_type();
    boolean that_present_subcomparator_type = true && that.isSetSubcomparator_type();
    if (this_present_subcomparator_type || that_present_subcomparator_type) {
      if (!(this_present_subcomparator_type && that_present_subcomparator_type))
        return false;
      if (!this.subcomparator_type.equals(that.subcomparator_type))
        return false;
    }

    boolean this_present_reconciler = true && this.isSetReconciler();
    boolean that_present_reconciler = true && that.isSetReconciler();
    if (this_present_reconciler || that_present_reconciler) {
      if (!(this_present_reconciler && that_present_reconciler))
        return false;
      if (!this.reconciler.equals(that.reconciler))
        return false;
    }

    boolean this_present_comment = true && this.isSetComment();
    boolean that_present_comment = true && that.isSetComment();
    if (this_present_comment || that_present_comment) {
      if (!(this_present_comment && that_present_comment))
        return false;
      if (!this.comment.equals(that.comment))
        return false;
    }

    boolean this_present_row_cache_size = true && this.isSetRow_cache_size();
    boolean that_present_row_cache_size = true && that.isSetRow_cache_size();
    if (this_present_row_cache_size || that_present_row_cache_size) {
      if (!(this_present_row_cache_size && that_present_row_cache_size))
        return false;
      if (this.row_cache_size != that.row_cache_size)
        return false;
    }

    boolean this_present_preload_row_cache = true && this.isSetPreload_row_cache();
    boolean that_present_preload_row_cache = true && that.isSetPreload_row_cache();
    if (this_present_preload_row_cache || that_present_preload_row_cache) {
      if (!(this_present_preload_row_cache && that_present_preload_row_cache))
        return false;
      if (this.preload_row_cache != that.preload_row_cache)
        return false;
    }

    boolean this_present_key_cache_size = true && this.isSetKey_cache_size();
    boolean that_present_key_cache_size = true && that.isSetKey_cache_size();
    if (this_present_key_cache_size || that_present_key_cache_size) {
      if (!(this_present_key_cache_size && that_present_key_cache_size))
        return false;
      if (this.key_cache_size != that.key_cache_size)
        return false;
    }

    boolean this_present_read_repair_chance = true && this.isSetRead_repair_chance();
    boolean that_present_read_repair_chance = true && that.isSetRead_repair_chance();
    if (this_present_read_repair_chance || that_present_read_repair_chance) {
      if (!(this_present_read_repair_chance && that_present_read_repair_chance))
        return false;
      if (this.read_repair_chance != that.read_repair_chance)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CfDef other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CfDef typedOther = (CfDef)other;

    lastComparison = Boolean.valueOf(isSetTable()).compareTo(typedOther.isSetTable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable()) {      lastComparison = TBaseHelper.compareTo(table, typedOther.table);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {      lastComparison = TBaseHelper.compareTo(name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumn_type()).compareTo(typedOther.isSetColumn_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumn_type()) {      lastComparison = TBaseHelper.compareTo(column_type, typedOther.column_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClock_type()).compareTo(typedOther.isSetClock_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClock_type()) {      lastComparison = TBaseHelper.compareTo(clock_type, typedOther.clock_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComparator_type()).compareTo(typedOther.isSetComparator_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComparator_type()) {      lastComparison = TBaseHelper.compareTo(comparator_type, typedOther.comparator_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSubcomparator_type()).compareTo(typedOther.isSetSubcomparator_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubcomparator_type()) {      lastComparison = TBaseHelper.compareTo(subcomparator_type, typedOther.subcomparator_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReconciler()).compareTo(typedOther.isSetReconciler());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReconciler()) {      lastComparison = TBaseHelper.compareTo(reconciler, typedOther.reconciler);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComment()).compareTo(typedOther.isSetComment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComment()) {      lastComparison = TBaseHelper.compareTo(comment, typedOther.comment);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRow_cache_size()).compareTo(typedOther.isSetRow_cache_size());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRow_cache_size()) {      lastComparison = TBaseHelper.compareTo(row_cache_size, typedOther.row_cache_size);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPreload_row_cache()).compareTo(typedOther.isSetPreload_row_cache());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPreload_row_cache()) {      lastComparison = TBaseHelper.compareTo(preload_row_cache, typedOther.preload_row_cache);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKey_cache_size()).compareTo(typedOther.isSetKey_cache_size());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey_cache_size()) {      lastComparison = TBaseHelper.compareTo(key_cache_size, typedOther.key_cache_size);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRead_repair_chance()).compareTo(typedOther.isSetRead_repair_chance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRead_repair_chance()) {      lastComparison = TBaseHelper.compareTo(read_repair_chance, typedOther.read_repair_chance);
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
        case 1: // TABLE
          if (field.type == TType.STRING) {
            this.table = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // COLUMN_TYPE
          if (field.type == TType.STRING) {
            this.column_type = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // CLOCK_TYPE
          if (field.type == TType.STRING) {
            this.clock_type = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // COMPARATOR_TYPE
          if (field.type == TType.STRING) {
            this.comparator_type = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // SUBCOMPARATOR_TYPE
          if (field.type == TType.STRING) {
            this.subcomparator_type = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // RECONCILER
          if (field.type == TType.STRING) {
            this.reconciler = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // COMMENT
          if (field.type == TType.STRING) {
            this.comment = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // ROW_CACHE_SIZE
          if (field.type == TType.DOUBLE) {
            this.row_cache_size = iprot.readDouble();
            setRow_cache_sizeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // PRELOAD_ROW_CACHE
          if (field.type == TType.BOOL) {
            this.preload_row_cache = iprot.readBool();
            setPreload_row_cacheIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 11: // KEY_CACHE_SIZE
          if (field.type == TType.DOUBLE) {
            this.key_cache_size = iprot.readDouble();
            setKey_cache_sizeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 12: // READ_REPAIR_CHANCE
          if (field.type == TType.DOUBLE) {
            this.read_repair_chance = iprot.readDouble();
            setRead_repair_chanceIsSet(true);
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
    if (this.table != null) {
      oprot.writeFieldBegin(TABLE_FIELD_DESC);
      oprot.writeString(this.table);
      oprot.writeFieldEnd();
    }
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.column_type != null) {
      if (isSetColumn_type()) {
        oprot.writeFieldBegin(COLUMN_TYPE_FIELD_DESC);
        oprot.writeString(this.column_type);
        oprot.writeFieldEnd();
      }
    }
    if (this.clock_type != null) {
      if (isSetClock_type()) {
        oprot.writeFieldBegin(CLOCK_TYPE_FIELD_DESC);
        oprot.writeString(this.clock_type);
        oprot.writeFieldEnd();
      }
    }
    if (this.comparator_type != null) {
      if (isSetComparator_type()) {
        oprot.writeFieldBegin(COMPARATOR_TYPE_FIELD_DESC);
        oprot.writeString(this.comparator_type);
        oprot.writeFieldEnd();
      }
    }
    if (this.subcomparator_type != null) {
      if (isSetSubcomparator_type()) {
        oprot.writeFieldBegin(SUBCOMPARATOR_TYPE_FIELD_DESC);
        oprot.writeString(this.subcomparator_type);
        oprot.writeFieldEnd();
      }
    }
    if (this.reconciler != null) {
      if (isSetReconciler()) {
        oprot.writeFieldBegin(RECONCILER_FIELD_DESC);
        oprot.writeString(this.reconciler);
        oprot.writeFieldEnd();
      }
    }
    if (this.comment != null) {
      if (isSetComment()) {
        oprot.writeFieldBegin(COMMENT_FIELD_DESC);
        oprot.writeString(this.comment);
        oprot.writeFieldEnd();
      }
    }
    if (isSetRow_cache_size()) {
      oprot.writeFieldBegin(ROW_CACHE_SIZE_FIELD_DESC);
      oprot.writeDouble(this.row_cache_size);
      oprot.writeFieldEnd();
    }
    if (isSetPreload_row_cache()) {
      oprot.writeFieldBegin(PRELOAD_ROW_CACHE_FIELD_DESC);
      oprot.writeBool(this.preload_row_cache);
      oprot.writeFieldEnd();
    }
    if (isSetKey_cache_size()) {
      oprot.writeFieldBegin(KEY_CACHE_SIZE_FIELD_DESC);
      oprot.writeDouble(this.key_cache_size);
      oprot.writeFieldEnd();
    }
    if (isSetRead_repair_chance()) {
      oprot.writeFieldBegin(READ_REPAIR_CHANCE_FIELD_DESC);
      oprot.writeDouble(this.read_repair_chance);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CfDef(");
    boolean first = true;

    sb.append("table:");
    if (this.table == null) {
      sb.append("null");
    } else {
      sb.append(this.table);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (isSetColumn_type()) {
      if (!first) sb.append(", ");
      sb.append("column_type:");
      if (this.column_type == null) {
        sb.append("null");
      } else {
        sb.append(this.column_type);
      }
      first = false;
    }
    if (isSetClock_type()) {
      if (!first) sb.append(", ");
      sb.append("clock_type:");
      if (this.clock_type == null) {
        sb.append("null");
      } else {
        sb.append(this.clock_type);
      }
      first = false;
    }
    if (isSetComparator_type()) {
      if (!first) sb.append(", ");
      sb.append("comparator_type:");
      if (this.comparator_type == null) {
        sb.append("null");
      } else {
        sb.append(this.comparator_type);
      }
      first = false;
    }
    if (isSetSubcomparator_type()) {
      if (!first) sb.append(", ");
      sb.append("subcomparator_type:");
      if (this.subcomparator_type == null) {
        sb.append("null");
      } else {
        sb.append(this.subcomparator_type);
      }
      first = false;
    }
    if (isSetReconciler()) {
      if (!first) sb.append(", ");
      sb.append("reconciler:");
      if (this.reconciler == null) {
        sb.append("null");
      } else {
        sb.append(this.reconciler);
      }
      first = false;
    }
    if (isSetComment()) {
      if (!first) sb.append(", ");
      sb.append("comment:");
      if (this.comment == null) {
        sb.append("null");
      } else {
        sb.append(this.comment);
      }
      first = false;
    }
    if (isSetRow_cache_size()) {
      if (!first) sb.append(", ");
      sb.append("row_cache_size:");
      sb.append(this.row_cache_size);
      first = false;
    }
    if (isSetPreload_row_cache()) {
      if (!first) sb.append(", ");
      sb.append("preload_row_cache:");
      sb.append(this.preload_row_cache);
      first = false;
    }
    if (isSetKey_cache_size()) {
      if (!first) sb.append(", ");
      sb.append("key_cache_size:");
      sb.append(this.key_cache_size);
      first = false;
    }
    if (isSetRead_repair_chance()) {
      if (!first) sb.append(", ");
      sb.append("read_repair_chance:");
      sb.append(this.read_repair_chance);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (table == null) {
      throw new TProtocolException("Required field 'table' was not present! Struct: " + toString());
    }
    if (name == null) {
      throw new TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
  }

}

