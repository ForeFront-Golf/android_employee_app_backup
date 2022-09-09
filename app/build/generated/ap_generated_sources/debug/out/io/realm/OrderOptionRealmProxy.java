package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class OrderOptionRealmProxy extends com.rhinoactive.foreorder_golf_employee.models.OrderOption
    implements RealmObjectProxy, OrderOptionRealmProxyInterface {

    static final class OrderOptionColumnInfo extends ColumnInfo {
        long optionItemIdIndex;
        long optionGroupIdIndex;
        long availableIndex;
        long descIndex;
        long nameIndex;
        long priceIndex;
        long validIndex;
        long modifiedAtIndex;

        OrderOptionColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("OrderOption");
            this.optionItemIdIndex = addColumnDetails("optionItemId", objectSchemaInfo);
            this.optionGroupIdIndex = addColumnDetails("optionGroupId", objectSchemaInfo);
            this.availableIndex = addColumnDetails("available", objectSchemaInfo);
            this.descIndex = addColumnDetails("desc", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", objectSchemaInfo);
            this.priceIndex = addColumnDetails("price", objectSchemaInfo);
            this.validIndex = addColumnDetails("valid", objectSchemaInfo);
            this.modifiedAtIndex = addColumnDetails("modifiedAt", objectSchemaInfo);
        }

        OrderOptionColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new OrderOptionColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final OrderOptionColumnInfo src = (OrderOptionColumnInfo) rawSrc;
            final OrderOptionColumnInfo dst = (OrderOptionColumnInfo) rawDst;
            dst.optionItemIdIndex = src.optionItemIdIndex;
            dst.optionGroupIdIndex = src.optionGroupIdIndex;
            dst.availableIndex = src.availableIndex;
            dst.descIndex = src.descIndex;
            dst.nameIndex = src.nameIndex;
            dst.priceIndex = src.priceIndex;
            dst.validIndex = src.validIndex;
            dst.modifiedAtIndex = src.modifiedAtIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(8);
        fieldNames.add("optionItemId");
        fieldNames.add("optionGroupId");
        fieldNames.add("available");
        fieldNames.add("desc");
        fieldNames.add("name");
        fieldNames.add("price");
        fieldNames.add("valid");
        fieldNames.add("modifiedAt");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private OrderOptionColumnInfo columnInfo;
    private ProxyState<com.rhinoactive.foreorder_golf_employee.models.OrderOption> proxyState;

    OrderOptionRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (OrderOptionColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.rhinoactive.foreorder_golf_employee.models.OrderOption>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$optionItemId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.optionItemIdIndex);
    }

    @Override
    public void realmSet$optionItemId(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'optionItemId' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$optionGroupId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.optionGroupIdIndex);
    }

    @Override
    public void realmSet$optionGroupId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.optionGroupIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.optionGroupIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.optionGroupIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.optionGroupIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$available() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.availableIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.availableIndex);
    }

    @Override
    public void realmSet$available(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.availableIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.availableIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.availableIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.availableIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$desc() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.descIndex);
    }

    @Override
    public void realmSet$desc(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.descIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.descIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.descIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.descIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Float realmGet$price() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.priceIndex)) {
            return null;
        }
        return (float) proxyState.getRow$realm().getFloat(columnInfo.priceIndex);
    }

    @Override
    public void realmSet$price(Float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.priceIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setFloat(columnInfo.priceIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.priceIndex);
            return;
        }
        proxyState.getRow$realm().setFloat(columnInfo.priceIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$valid() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.validIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.validIndex);
    }

    @Override
    public void realmSet$valid(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.validIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.validIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.validIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.validIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$modifiedAt() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.modifiedAtIndex)) {
            return null;
        }
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.modifiedAtIndex);
    }

    @Override
    public void realmSet$modifiedAt(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.modifiedAtIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDate(columnInfo.modifiedAtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.modifiedAtIndex);
            return;
        }
        proxyState.getRow$realm().setDate(columnInfo.modifiedAtIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("OrderOption", 8, 0);
        builder.addPersistedProperty("optionItemId", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("optionGroupId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("available", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("desc", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("price", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("valid", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("modifiedAt", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static OrderOptionColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new OrderOptionColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "OrderOption";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.rhinoactive.foreorder_golf_employee.models.OrderOption createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.rhinoactive.foreorder_golf_employee.models.OrderOption obj = null;
        if (update) {
            Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class);
            OrderOptionColumnInfo columnInfo = (OrderOptionColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class);
            long pkColumnIndex = columnInfo.optionItemIdIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("optionItemId")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("optionItemId"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class), false, Collections.<String> emptyList());
                    obj = new io.realm.OrderOptionRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("optionItemId")) {
                if (json.isNull("optionItemId")) {
                    obj = (io.realm.OrderOptionRealmProxy) realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.OrderOptionRealmProxy) realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class, json.getString("optionItemId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'optionItemId'.");
            }
        }

        final OrderOptionRealmProxyInterface objProxy = (OrderOptionRealmProxyInterface) obj;
        if (json.has("optionGroupId")) {
            if (json.isNull("optionGroupId")) {
                objProxy.realmSet$optionGroupId(null);
            } else {
                objProxy.realmSet$optionGroupId((String) json.getString("optionGroupId"));
            }
        }
        if (json.has("available")) {
            if (json.isNull("available")) {
                objProxy.realmSet$available(null);
            } else {
                objProxy.realmSet$available((boolean) json.getBoolean("available"));
            }
        }
        if (json.has("desc")) {
            if (json.isNull("desc")) {
                objProxy.realmSet$desc(null);
            } else {
                objProxy.realmSet$desc((String) json.getString("desc"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("price")) {
            if (json.isNull("price")) {
                objProxy.realmSet$price(null);
            } else {
                objProxy.realmSet$price((float) json.getDouble("price"));
            }
        }
        if (json.has("valid")) {
            if (json.isNull("valid")) {
                objProxy.realmSet$valid(null);
            } else {
                objProxy.realmSet$valid((boolean) json.getBoolean("valid"));
            }
        }
        if (json.has("modifiedAt")) {
            if (json.isNull("modifiedAt")) {
                objProxy.realmSet$modifiedAt(null);
            } else {
                Object timestamp = json.get("modifiedAt");
                if (timestamp instanceof String) {
                    objProxy.realmSet$modifiedAt(JsonUtils.stringToDate((String) timestamp));
                } else {
                    objProxy.realmSet$modifiedAt(new Date(json.getLong("modifiedAt")));
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.rhinoactive.foreorder_golf_employee.models.OrderOption createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.rhinoactive.foreorder_golf_employee.models.OrderOption obj = new com.rhinoactive.foreorder_golf_employee.models.OrderOption();
        final OrderOptionRealmProxyInterface objProxy = (OrderOptionRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("optionItemId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$optionItemId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$optionItemId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("optionGroupId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$optionGroupId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$optionGroupId(null);
                }
            } else if (name.equals("available")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$available((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$available(null);
                }
            } else if (name.equals("desc")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$desc((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$desc(null);
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("price")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$price((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$price(null);
                }
            } else if (name.equals("valid")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$valid((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$valid(null);
                }
            } else if (name.equals("modifiedAt")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$modifiedAt(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        objProxy.realmSet$modifiedAt(new Date(timestamp));
                    }
                } else {
                    objProxy.realmSet$modifiedAt(JsonUtils.stringToDate(reader.nextString()));
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'optionItemId'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.rhinoactive.foreorder_golf_employee.models.OrderOption copyOrUpdate(Realm realm, com.rhinoactive.foreorder_golf_employee.models.OrderOption object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.rhinoactive.foreorder_golf_employee.models.OrderOption) cachedRealmObject;
        }

        com.rhinoactive.foreorder_golf_employee.models.OrderOption realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class);
            OrderOptionColumnInfo columnInfo = (OrderOptionColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class);
            long pkColumnIndex = columnInfo.optionItemIdIndex;
            String value = ((OrderOptionRealmProxyInterface) object).realmGet$optionItemId();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, value);
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.OrderOptionRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.rhinoactive.foreorder_golf_employee.models.OrderOption copy(Realm realm, com.rhinoactive.foreorder_golf_employee.models.OrderOption newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.rhinoactive.foreorder_golf_employee.models.OrderOption) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.rhinoactive.foreorder_golf_employee.models.OrderOption realmObject = realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class, ((OrderOptionRealmProxyInterface) newObject).realmGet$optionItemId(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        OrderOptionRealmProxyInterface realmObjectSource = (OrderOptionRealmProxyInterface) newObject;
        OrderOptionRealmProxyInterface realmObjectCopy = (OrderOptionRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$optionGroupId(realmObjectSource.realmGet$optionGroupId());
        realmObjectCopy.realmSet$available(realmObjectSource.realmGet$available());
        realmObjectCopy.realmSet$desc(realmObjectSource.realmGet$desc());
        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$price(realmObjectSource.realmGet$price());
        realmObjectCopy.realmSet$valid(realmObjectSource.realmGet$valid());
        realmObjectCopy.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        return realmObject;
    }

    public static long insert(Realm realm, com.rhinoactive.foreorder_golf_employee.models.OrderOption object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class);
        long tableNativePtr = table.getNativePtr();
        OrderOptionColumnInfo columnInfo = (OrderOptionColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class);
        long pkColumnIndex = columnInfo.optionItemIdIndex;
        String primaryKeyValue = ((OrderOptionRealmProxyInterface) object).realmGet$optionItemId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$optionGroupId = ((OrderOptionRealmProxyInterface) object).realmGet$optionGroupId();
        if (realmGet$optionGroupId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.optionGroupIdIndex, rowIndex, realmGet$optionGroupId, false);
        }
        Boolean realmGet$available = ((OrderOptionRealmProxyInterface) object).realmGet$available();
        if (realmGet$available != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.availableIndex, rowIndex, realmGet$available, false);
        }
        String realmGet$desc = ((OrderOptionRealmProxyInterface) object).realmGet$desc();
        if (realmGet$desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
        }
        String realmGet$name = ((OrderOptionRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        Float realmGet$price = ((OrderOptionRealmProxyInterface) object).realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.priceIndex, rowIndex, realmGet$price, false);
        }
        Boolean realmGet$valid = ((OrderOptionRealmProxyInterface) object).realmGet$valid();
        if (realmGet$valid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
        }
        java.util.Date realmGet$modifiedAt = ((OrderOptionRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class);
        long tableNativePtr = table.getNativePtr();
        OrderOptionColumnInfo columnInfo = (OrderOptionColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class);
        long pkColumnIndex = columnInfo.optionItemIdIndex;
        com.rhinoactive.foreorder_golf_employee.models.OrderOption object = null;
        while (objects.hasNext()) {
            object = (com.rhinoactive.foreorder_golf_employee.models.OrderOption) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((OrderOptionRealmProxyInterface) object).realmGet$optionItemId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$optionGroupId = ((OrderOptionRealmProxyInterface) object).realmGet$optionGroupId();
            if (realmGet$optionGroupId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.optionGroupIdIndex, rowIndex, realmGet$optionGroupId, false);
            }
            Boolean realmGet$available = ((OrderOptionRealmProxyInterface) object).realmGet$available();
            if (realmGet$available != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.availableIndex, rowIndex, realmGet$available, false);
            }
            String realmGet$desc = ((OrderOptionRealmProxyInterface) object).realmGet$desc();
            if (realmGet$desc != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
            }
            String realmGet$name = ((OrderOptionRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            Float realmGet$price = ((OrderOptionRealmProxyInterface) object).realmGet$price();
            if (realmGet$price != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.priceIndex, rowIndex, realmGet$price, false);
            }
            Boolean realmGet$valid = ((OrderOptionRealmProxyInterface) object).realmGet$valid();
            if (realmGet$valid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
            }
            java.util.Date realmGet$modifiedAt = ((OrderOptionRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.rhinoactive.foreorder_golf_employee.models.OrderOption object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class);
        long tableNativePtr = table.getNativePtr();
        OrderOptionColumnInfo columnInfo = (OrderOptionColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class);
        long pkColumnIndex = columnInfo.optionItemIdIndex;
        String primaryKeyValue = ((OrderOptionRealmProxyInterface) object).realmGet$optionItemId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$optionGroupId = ((OrderOptionRealmProxyInterface) object).realmGet$optionGroupId();
        if (realmGet$optionGroupId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.optionGroupIdIndex, rowIndex, realmGet$optionGroupId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.optionGroupIdIndex, rowIndex, false);
        }
        Boolean realmGet$available = ((OrderOptionRealmProxyInterface) object).realmGet$available();
        if (realmGet$available != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.availableIndex, rowIndex, realmGet$available, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.availableIndex, rowIndex, false);
        }
        String realmGet$desc = ((OrderOptionRealmProxyInterface) object).realmGet$desc();
        if (realmGet$desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descIndex, rowIndex, false);
        }
        String realmGet$name = ((OrderOptionRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        Float realmGet$price = ((OrderOptionRealmProxyInterface) object).realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.priceIndex, rowIndex, realmGet$price, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.priceIndex, rowIndex, false);
        }
        Boolean realmGet$valid = ((OrderOptionRealmProxyInterface) object).realmGet$valid();
        if (realmGet$valid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.validIndex, rowIndex, false);
        }
        java.util.Date realmGet$modifiedAt = ((OrderOptionRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class);
        long tableNativePtr = table.getNativePtr();
        OrderOptionColumnInfo columnInfo = (OrderOptionColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class);
        long pkColumnIndex = columnInfo.optionItemIdIndex;
        com.rhinoactive.foreorder_golf_employee.models.OrderOption object = null;
        while (objects.hasNext()) {
            object = (com.rhinoactive.foreorder_golf_employee.models.OrderOption) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((OrderOptionRealmProxyInterface) object).realmGet$optionItemId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$optionGroupId = ((OrderOptionRealmProxyInterface) object).realmGet$optionGroupId();
            if (realmGet$optionGroupId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.optionGroupIdIndex, rowIndex, realmGet$optionGroupId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.optionGroupIdIndex, rowIndex, false);
            }
            Boolean realmGet$available = ((OrderOptionRealmProxyInterface) object).realmGet$available();
            if (realmGet$available != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.availableIndex, rowIndex, realmGet$available, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.availableIndex, rowIndex, false);
            }
            String realmGet$desc = ((OrderOptionRealmProxyInterface) object).realmGet$desc();
            if (realmGet$desc != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.descIndex, rowIndex, false);
            }
            String realmGet$name = ((OrderOptionRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            Float realmGet$price = ((OrderOptionRealmProxyInterface) object).realmGet$price();
            if (realmGet$price != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.priceIndex, rowIndex, realmGet$price, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.priceIndex, rowIndex, false);
            }
            Boolean realmGet$valid = ((OrderOptionRealmProxyInterface) object).realmGet$valid();
            if (realmGet$valid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.validIndex, rowIndex, false);
            }
            java.util.Date realmGet$modifiedAt = ((OrderOptionRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
            }
        }
    }

    public static com.rhinoactive.foreorder_golf_employee.models.OrderOption createDetachedCopy(com.rhinoactive.foreorder_golf_employee.models.OrderOption realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.rhinoactive.foreorder_golf_employee.models.OrderOption unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.rhinoactive.foreorder_golf_employee.models.OrderOption();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.rhinoactive.foreorder_golf_employee.models.OrderOption) cachedObject.object;
            }
            unmanagedObject = (com.rhinoactive.foreorder_golf_employee.models.OrderOption) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        OrderOptionRealmProxyInterface unmanagedCopy = (OrderOptionRealmProxyInterface) unmanagedObject;
        OrderOptionRealmProxyInterface realmSource = (OrderOptionRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$optionItemId(realmSource.realmGet$optionItemId());
        unmanagedCopy.realmSet$optionGroupId(realmSource.realmGet$optionGroupId());
        unmanagedCopy.realmSet$available(realmSource.realmGet$available());
        unmanagedCopy.realmSet$desc(realmSource.realmGet$desc());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$price(realmSource.realmGet$price());
        unmanagedCopy.realmSet$valid(realmSource.realmGet$valid());
        unmanagedCopy.realmSet$modifiedAt(realmSource.realmGet$modifiedAt());

        return unmanagedObject;
    }

    static com.rhinoactive.foreorder_golf_employee.models.OrderOption update(Realm realm, com.rhinoactive.foreorder_golf_employee.models.OrderOption realmObject, com.rhinoactive.foreorder_golf_employee.models.OrderOption newObject, Map<RealmModel, RealmObjectProxy> cache) {
        OrderOptionRealmProxyInterface realmObjectTarget = (OrderOptionRealmProxyInterface) realmObject;
        OrderOptionRealmProxyInterface realmObjectSource = (OrderOptionRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$optionGroupId(realmObjectSource.realmGet$optionGroupId());
        realmObjectTarget.realmSet$available(realmObjectSource.realmGet$available());
        realmObjectTarget.realmSet$desc(realmObjectSource.realmGet$desc());
        realmObjectTarget.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectTarget.realmSet$price(realmObjectSource.realmGet$price());
        realmObjectTarget.realmSet$valid(realmObjectSource.realmGet$valid());
        realmObjectTarget.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("OrderOption = proxy[");
        stringBuilder.append("{optionItemId:");
        stringBuilder.append(realmGet$optionItemId() != null ? realmGet$optionItemId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{optionGroupId:");
        stringBuilder.append(realmGet$optionGroupId() != null ? realmGet$optionGroupId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{available:");
        stringBuilder.append(realmGet$available() != null ? realmGet$available() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{desc:");
        stringBuilder.append(realmGet$desc() != null ? realmGet$desc() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{price:");
        stringBuilder.append(realmGet$price() != null ? realmGet$price() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{valid:");
        stringBuilder.append(realmGet$valid() != null ? realmGet$valid() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{modifiedAt:");
        stringBuilder.append(realmGet$modifiedAt() != null ? realmGet$modifiedAt() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderOptionRealmProxy aOrderOption = (OrderOptionRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aOrderOption.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aOrderOption.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aOrderOption.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
