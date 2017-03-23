// ORM class for table 'exposure'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Jan 09 19:30:12 CST 2017
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class exposure extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Long id;
  public Long get_id() {
    return id;
  }
  public void set_id(Long id) {
    this.id = id;
  }
  public exposure with_id(Long id) {
    this.id = id;
    return this;
  }
  private Long auid;
  public Long get_auid() {
    return auid;
  }
  public void set_auid(Long auid) {
    this.auid = auid;
  }
  public exposure with_auid(Long auid) {
    this.auid = auid;
    return this;
  }
  private Long cuid;
  public Long get_cuid() {
    return cuid;
  }
  public void set_cuid(Long cuid) {
    this.cuid = cuid;
  }
  public exposure with_cuid(Long cuid) {
    this.cuid = cuid;
    return this;
  }
  private Long buid;
  public Long get_buid() {
    return buid;
  }
  public void set_buid(Long buid) {
    this.buid = buid;
  }
  public exposure with_buid(Long buid) {
    this.buid = buid;
    return this;
  }
  private String scene;
  public String get_scene() {
    return scene;
  }
  public void set_scene(String scene) {
    this.scene = scene;
  }
  public exposure with_scene(String scene) {
    this.scene = scene;
    return this;
  }
  private String material_id;
  public String get_material_id() {
    return material_id;
  }
  public void set_material_id(String material_id) {
    this.material_id = material_id;
  }
  public exposure with_material_id(String material_id) {
    this.material_id = material_id;
    return this;
  }
  private String type;
  public String get_type() {
    return type;
  }
  public void set_type(String type) {
    this.type = type;
  }
  public exposure with_type(String type) {
    this.type = type;
    return this;
  }
  private String appkey;
  public String get_appkey() {
    return appkey;
  }
  public void set_appkey(String appkey) {
    this.appkey = appkey;
  }
  public exposure with_appkey(String appkey) {
    this.appkey = appkey;
    return this;
  }
  private String container_id;
  public String get_container_id() {
    return container_id;
  }
  public void set_container_id(String container_id) {
    this.container_id = container_id;
  }
  public exposure with_container_id(String container_id) {
    this.container_id = container_id;
    return this;
  }
  private String blank;
  public String get_blank() {
    return blank;
  }
  public void set_blank(String blank) {
    this.blank = blank;
  }
  public exposure with_blank(String blank) {
    this.blank = blank;
    return this;
  }
  private java.sql.Timestamp time;
  public java.sql.Timestamp get_time() {
    return time;
  }
  public void set_time(java.sql.Timestamp time) {
    this.time = time;
  }
  public exposure with_time(java.sql.Timestamp time) {
    this.time = time;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof exposure)) {
      return false;
    }
    exposure that = (exposure) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.auid == null ? that.auid == null : this.auid.equals(that.auid));
    equal = equal && (this.cuid == null ? that.cuid == null : this.cuid.equals(that.cuid));
    equal = equal && (this.buid == null ? that.buid == null : this.buid.equals(that.buid));
    equal = equal && (this.scene == null ? that.scene == null : this.scene.equals(that.scene));
    equal = equal && (this.material_id == null ? that.material_id == null : this.material_id.equals(that.material_id));
    equal = equal && (this.type == null ? that.type == null : this.type.equals(that.type));
    equal = equal && (this.appkey == null ? that.appkey == null : this.appkey.equals(that.appkey));
    equal = equal && (this.container_id == null ? that.container_id == null : this.container_id.equals(that.container_id));
    equal = equal && (this.blank == null ? that.blank == null : this.blank.equals(that.blank));
    equal = equal && (this.time == null ? that.time == null : this.time.equals(that.time));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof exposure)) {
      return false;
    }
    exposure that = (exposure) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.auid == null ? that.auid == null : this.auid.equals(that.auid));
    equal = equal && (this.cuid == null ? that.cuid == null : this.cuid.equals(that.cuid));
    equal = equal && (this.buid == null ? that.buid == null : this.buid.equals(that.buid));
    equal = equal && (this.scene == null ? that.scene == null : this.scene.equals(that.scene));
    equal = equal && (this.material_id == null ? that.material_id == null : this.material_id.equals(that.material_id));
    equal = equal && (this.type == null ? that.type == null : this.type.equals(that.type));
    equal = equal && (this.appkey == null ? that.appkey == null : this.appkey.equals(that.appkey));
    equal = equal && (this.container_id == null ? that.container_id == null : this.container_id.equals(that.container_id));
    equal = equal && (this.blank == null ? that.blank == null : this.blank.equals(that.blank));
    equal = equal && (this.time == null ? that.time == null : this.time.equals(that.time));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.auid = JdbcWritableBridge.readLong(2, __dbResults);
    this.cuid = JdbcWritableBridge.readLong(3, __dbResults);
    this.buid = JdbcWritableBridge.readLong(4, __dbResults);
    this.scene = JdbcWritableBridge.readString(5, __dbResults);
    this.material_id = JdbcWritableBridge.readString(6, __dbResults);
    this.type = JdbcWritableBridge.readString(7, __dbResults);
    this.appkey = JdbcWritableBridge.readString(8, __dbResults);
    this.container_id = JdbcWritableBridge.readString(9, __dbResults);
    this.blank = JdbcWritableBridge.readString(10, __dbResults);
    this.time = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.auid = JdbcWritableBridge.readLong(2, __dbResults);
    this.cuid = JdbcWritableBridge.readLong(3, __dbResults);
    this.buid = JdbcWritableBridge.readLong(4, __dbResults);
    this.scene = JdbcWritableBridge.readString(5, __dbResults);
    this.material_id = JdbcWritableBridge.readString(6, __dbResults);
    this.type = JdbcWritableBridge.readString(7, __dbResults);
    this.appkey = JdbcWritableBridge.readString(8, __dbResults);
    this.container_id = JdbcWritableBridge.readString(9, __dbResults);
    this.blank = JdbcWritableBridge.readString(10, __dbResults);
    this.time = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(auid, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(cuid, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(buid, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(scene, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(material_id, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(type, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(appkey, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(container_id, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(blank, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(time, 11 + __off, 93, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(auid, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(cuid, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(buid, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(scene, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(material_id, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(type, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(appkey, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(container_id, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(blank, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(time, 11 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.auid = null;
    } else {
    this.auid = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.cuid = null;
    } else {
    this.cuid = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.buid = null;
    } else {
    this.buid = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.scene = null;
    } else {
    this.scene = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.material_id = null;
    } else {
    this.material_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.type = null;
    } else {
    this.type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.appkey = null;
    } else {
    this.appkey = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.container_id = null;
    } else {
    this.container_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.blank = null;
    } else {
    this.blank = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.time = null;
    } else {
    this.time = new Timestamp(__dataIn.readLong());
    this.time.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.auid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.auid);
    }
    if (null == this.cuid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.cuid);
    }
    if (null == this.buid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.buid);
    }
    if (null == this.scene) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, scene);
    }
    if (null == this.material_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, material_id);
    }
    if (null == this.type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, type);
    }
    if (null == this.appkey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, appkey);
    }
    if (null == this.container_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, container_id);
    }
    if (null == this.blank) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, blank);
    }
    if (null == this.time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.time.getTime());
    __dataOut.writeInt(this.time.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.auid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.auid);
    }
    if (null == this.cuid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.cuid);
    }
    if (null == this.buid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.buid);
    }
    if (null == this.scene) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, scene);
    }
    if (null == this.material_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, material_id);
    }
    if (null == this.type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, type);
    }
    if (null == this.appkey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, appkey);
    }
    if (null == this.container_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, container_id);
    }
    if (null == this.blank) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, blank);
    }
    if (null == this.time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.time.getTime());
    __dataOut.writeInt(this.time.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(auid==null?"null":"" + auid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cuid==null?"null":"" + cuid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buid==null?"null":"" + buid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(scene==null?"null":scene, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(material_id==null?"null":material_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(type==null?"null":type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(appkey==null?"null":appkey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(container_id==null?"null":container_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(blank==null?"null":blank, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time==null?"null":"" + time, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(auid==null?"null":"" + auid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cuid==null?"null":"" + cuid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buid==null?"null":"" + buid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(scene==null?"null":scene, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(material_id==null?"null":material_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(type==null?"null":type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(appkey==null?"null":appkey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(container_id==null?"null":container_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(blank==null?"null":blank, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time==null?"null":"" + time, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.auid = null; } else {
      this.auid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cuid = null; } else {
      this.cuid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.buid = null; } else {
      this.buid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.scene = null; } else {
      this.scene = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.material_id = null; } else {
      this.material_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.type = null; } else {
      this.type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.appkey = null; } else {
      this.appkey = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.container_id = null; } else {
      this.container_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.blank = null; } else {
      this.blank = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.time = null; } else {
      this.time = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.auid = null; } else {
      this.auid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cuid = null; } else {
      this.cuid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.buid = null; } else {
      this.buid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.scene = null; } else {
      this.scene = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.material_id = null; } else {
      this.material_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.type = null; } else {
      this.type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.appkey = null; } else {
      this.appkey = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.container_id = null; } else {
      this.container_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.blank = null; } else {
      this.blank = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.time = null; } else {
      this.time = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    exposure o = (exposure) super.clone();
    o.time = (o.time != null) ? (java.sql.Timestamp) o.time.clone() : null;
    return o;
  }

  public void clone0(exposure o) throws CloneNotSupportedException {
    o.time = (o.time != null) ? (java.sql.Timestamp) o.time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("auid", this.auid);
    __sqoop$field_map.put("cuid", this.cuid);
    __sqoop$field_map.put("buid", this.buid);
    __sqoop$field_map.put("scene", this.scene);
    __sqoop$field_map.put("material_id", this.material_id);
    __sqoop$field_map.put("type", this.type);
    __sqoop$field_map.put("appkey", this.appkey);
    __sqoop$field_map.put("container_id", this.container_id);
    __sqoop$field_map.put("blank", this.blank);
    __sqoop$field_map.put("time", this.time);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("auid", this.auid);
    __sqoop$field_map.put("cuid", this.cuid);
    __sqoop$field_map.put("buid", this.buid);
    __sqoop$field_map.put("scene", this.scene);
    __sqoop$field_map.put("material_id", this.material_id);
    __sqoop$field_map.put("type", this.type);
    __sqoop$field_map.put("appkey", this.appkey);
    __sqoop$field_map.put("container_id", this.container_id);
    __sqoop$field_map.put("blank", this.blank);
    __sqoop$field_map.put("time", this.time);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Long) __fieldVal;
    }
    else    if ("auid".equals(__fieldName)) {
      this.auid = (Long) __fieldVal;
    }
    else    if ("cuid".equals(__fieldName)) {
      this.cuid = (Long) __fieldVal;
    }
    else    if ("buid".equals(__fieldName)) {
      this.buid = (Long) __fieldVal;
    }
    else    if ("scene".equals(__fieldName)) {
      this.scene = (String) __fieldVal;
    }
    else    if ("material_id".equals(__fieldName)) {
      this.material_id = (String) __fieldVal;
    }
    else    if ("type".equals(__fieldName)) {
      this.type = (String) __fieldVal;
    }
    else    if ("appkey".equals(__fieldName)) {
      this.appkey = (String) __fieldVal;
    }
    else    if ("container_id".equals(__fieldName)) {
      this.container_id = (String) __fieldVal;
    }
    else    if ("blank".equals(__fieldName)) {
      this.blank = (String) __fieldVal;
    }
    else    if ("time".equals(__fieldName)) {
      this.time = (java.sql.Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Long) __fieldVal;
      return true;
    }
    else    if ("auid".equals(__fieldName)) {
      this.auid = (Long) __fieldVal;
      return true;
    }
    else    if ("cuid".equals(__fieldName)) {
      this.cuid = (Long) __fieldVal;
      return true;
    }
    else    if ("buid".equals(__fieldName)) {
      this.buid = (Long) __fieldVal;
      return true;
    }
    else    if ("scene".equals(__fieldName)) {
      this.scene = (String) __fieldVal;
      return true;
    }
    else    if ("material_id".equals(__fieldName)) {
      this.material_id = (String) __fieldVal;
      return true;
    }
    else    if ("type".equals(__fieldName)) {
      this.type = (String) __fieldVal;
      return true;
    }
    else    if ("appkey".equals(__fieldName)) {
      this.appkey = (String) __fieldVal;
      return true;
    }
    else    if ("container_id".equals(__fieldName)) {
      this.container_id = (String) __fieldVal;
      return true;
    }
    else    if ("blank".equals(__fieldName)) {
      this.blank = (String) __fieldVal;
      return true;
    }
    else    if ("time".equals(__fieldName)) {
      this.time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
