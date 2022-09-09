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
public class UserLocationRealmProxy extends com.rhinoactive.foreorder_golf_employee.models.UserLocation
    implements RealmObjectProxy, UserLocationRealmProxyInterface {

    static final class UserLocationColumnInfo extends ColumnInfo {
        long userIdIndex;
        long latIndex;
        long lonIndex;

        UserLocationColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("UserLocation");
            this.userIdIndex = addColumnDetails("userId", objectSchemaInfo);
            this.latIndex = addColumnDetails("lat", objectSchemaInfo);
            this.lonIndex = addColumnDetails("lon", objectSchemaInfo);
        }

        UserLocationColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserLocationColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserLocationColumnInfo src = (UserLocationColumnInfo) rawSrc;
            final UserLocationColumnInfo dst = (UserLocationColumnInfo) rawDst;
            dst.userIdIndex = src.userIdIndex;
            dst.latIndex = src.latIndex;
            dst.lonIndex = src.lonIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(3);
        fieldNames.add("userId");
        fieldNames.add("lat");
        fieldNames.add("lon");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private UserLocationColumnInfo columnInfo;
    private ProxyState<com.rhinoactive.foreorder_golf_employee.models.UserLocation> proxyState;

    UserLocationRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserLocationColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.rhinoactive.foreorder_golf_employee.models.UserLocation>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$userId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.userIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.userIdIndex);
    }

    @Override
    public void realmSet$userId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'userId' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public Double realmGet$lat() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.latIndex)) {
            return null;
        }
        return (double) proxyState.getRow$realm().getDouble(columnInfo.latIndex);
    }

    @Override
    public void realmSet$lat(Double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.latIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDouble(columnInfo.latIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.latIndex);
            return;
        }
        proxyState.getRow$realm().setDouble(columnInfo.latIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Double realmGet$lon() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.lonIndex)) {
            return null;
        }
        return (double) proxyState.getRow$realm().getDouble(columnInfo.lonIndex);
    }

    @Override
    public void realmSet$lon(Double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lonIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDouble(columnInfo.lonIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lonIndex);
            return;
        }
        proxyState.getRow$realm().setDouble(columnInfo.lonIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("UserLocation", 3, 0);
        builder.addPersistedProperty("userId", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lat", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lon", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserLocationColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserLocationColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "UserLocation";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.rhinoactive.foreorder_golf_employee.models.UserLocation createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.rhinoactive.foreorder_golf_employee.models.UserLocation obj = null;
        if (update) {
            Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class);
            UserLocationColumnInfo columnInfo = (UserLocationColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class);
            long pkColumnIndex = columnInfo.userIdIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("userId")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("userId"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class), false, Collections.<String> emptyList());
                    obj = new io.realm.UserLocationRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("userId")) {
                if (json.isNull("userId")) {
                    obj = (io.realm.UserLocationRealmProxy) realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.UserLocationRealmProxy) realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class, json.getInt("userId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'userId'.");
            }
        }

        final UserLocationRealmProxyInterface objProxy = (UserLocationRealmProxyInterface) obj;
        if (json.has("lat")) {
            if (json.isNull("lat")) {
                objProxy.realmSet$lat(null);
            } else {
                objProxy.realmSet$lat((double) json.getDouble("lat"));
            }
        }
        if (json.has("lon")) {
            if (json.isNull("lon")) {
                objProxy.realmSet$lon(null);
            } else {
                objProxy.realmSet$lon((double) json.getDouble("lon"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.rhinoactive.foreorder_golf_employee.models.UserLocation createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.rhinoactive.foreorder_golf_employee.models.UserLocation obj = new com.rhinoactive.foreorder_golf_employee.models.UserLocation();
        final UserLocationRealmProxyInterface objProxy = (UserLocationRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("userId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("lat")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lat((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lat(null);
                }
            } else if (name.equals("lon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lon((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lon(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'userId'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.rhinoactive.foreorder_golf_employee.models.UserLocation copyOrUpdate(Realm realm, com.rhinoactive.foreorder_golf_employee.models.UserLocation object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.rhinoactive.foreorder_golf_employee.models.UserLocation) cachedRealmObject;
        }

        com.rhinoactive.foreorder_golf_employee.models.UserLocation realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class);
            UserLocationColumnInfo columnInfo = (UserLocationColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class);
            long pkColumnIndex = columnInfo.userIdIndex;
            Number value = ((UserLocationRealmProxyInterface) object).realmGet$userId();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, value.longValue());
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.UserLocationRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.rhinoactive.foreorder_golf_employee.models.UserLocation copy(Realm realm, com.rhinoactive.foreorder_golf_employee.models.UserLocation newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.rhinoactive.foreorder_golf_employee.models.UserLocation) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.rhinoactive.foreorder_golf_employee.models.UserLocation realmObject = realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class, ((UserLocationRealmProxyInterface) newObject).realmGet$userId(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        UserLocationRealmProxyInterface realmObjectSource = (UserLocationRealmProxyInterface) newObject;
        UserLocationRealmProxyInterface realmObjectCopy = (UserLocationRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$lat(realmObjectSource.realmGet$lat());
        realmObjectCopy.realmSet$lon(realmObjectSource.realmGet$lon());
        return realmObject;
    }

    public static long insert(Realm realm, com.rhinoactive.foreorder_golf_employee.models.UserLocation object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class);
        long tableNativePtr = table.getNativePtr();
        UserLocationColumnInfo columnInfo = (UserLocationColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class);
        long pkColumnIndex = columnInfo.userIdIndex;
        Object primaryKeyValue = ((UserLocationRealmProxyInterface) object).realmGet$userId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((UserLocationRealmProxyInterface) object).realmGet$userId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((UserLocationRealmProxyInterface) object).realmGet$userId());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Double realmGet$lat = ((UserLocationRealmProxyInterface) object).realmGet$lat();
        if (realmGet$lat != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
        }
        Double realmGet$lon = ((UserLocationRealmProxyInterface) object).realmGet$lon();
        if (realmGet$lon != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, realmGet$lon, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class);
        long tableNativePtr = table.getNativePtr();
        UserLocationColumnInfo columnInfo = (UserLocationColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class);
        long pkColumnIndex = columnInfo.userIdIndex;
        com.rhinoactive.foreorder_golf_employee.models.UserLocation object = null;
        while (objects.hasNext()) {
            object = (com.rhinoactive.foreorder_golf_employee.models.UserLocation) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((UserLocationRealmProxyInterface) object).realmGet$userId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((UserLocationRealmProxyInterface) object).realmGet$userId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((UserLocationRealmProxyInterface) object).realmGet$userId());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Double realmGet$lat = ((UserLocationRealmProxyInterface) object).realmGet$lat();
            if (realmGet$lat != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
            }
            Double realmGet$lon = ((UserLocationRealmProxyInterface) object).realmGet$lon();
            if (realmGet$lon != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, realmGet$lon, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.rhinoactive.foreorder_golf_employee.models.UserLocation object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class);
        long tableNativePtr = table.getNativePtr();
        UserLocationColumnInfo columnInfo = (UserLocationColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class);
        long pkColumnIndex = columnInfo.userIdIndex;
        Object primaryKeyValue = ((UserLocationRealmProxyInterface) object).realmGet$userId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((UserLocationRealmProxyInterface) object).realmGet$userId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((UserLocationRealmProxyInterface) object).realmGet$userId());
        }
        cache.put(object, rowIndex);
        Double realmGet$lat = ((UserLocationRealmProxyInterface) object).realmGet$lat();
        if (realmGet$lat != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.latIndex, rowIndex, false);
        }
        Double realmGet$lon = ((UserLocationRealmProxyInterface) object).realmGet$lon();
        if (realmGet$lon != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, realmGet$lon, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lonIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class);
        long tableNativePtr = table.getNativePtr();
        UserLocationColumnInfo columnInfo = (UserLocationColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class);
        long pkColumnIndex = columnInfo.userIdIndex;
        com.rhinoactive.foreorder_golf_employee.models.UserLocation object = null;
        while (objects.hasNext()) {
            object = (com.rhinoactive.foreorder_golf_employee.models.UserLocation) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((UserLocationRealmProxyInterface) object).realmGet$userId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((UserLocationRealmProxyInterface) object).realmGet$userId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((UserLocationRealmProxyInterface) object).realmGet$userId());
            }
            cache.put(object, rowIndex);
            Double realmGet$lat = ((UserLocationRealmProxyInterface) object).realmGet$lat();
            if (realmGet$lat != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.latIndex, rowIndex, false);
            }
            Double realmGet$lon = ((UserLocationRealmProxyInterface) object).realmGet$lon();
            if (realmGet$lon != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, realmGet$lon, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lonIndex, rowIndex, false);
            }
        }
    }

    public static com.rhinoactive.foreorder_golf_employee.models.UserLocation createDetachedCopy(com.rhinoactive.foreorder_golf_employee.models.UserLocation realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.rhinoactive.foreorder_golf_employee.models.UserLocation unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.rhinoactive.foreorder_golf_employee.models.UserLocation();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.rhinoactive.foreorder_golf_employee.models.UserLocation) cachedObject.object;
            }
            unmanagedObject = (com.rhinoactive.foreorder_golf_employee.models.UserLocation) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        UserLocationRealmProxyInterface unmanagedCopy = (UserLocationRealmProxyInterface) unmanagedObject;
        UserLocationRealmProxyInterface realmSource = (UserLocationRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$userId(realmSource.realmGet$userId());
        unmanagedCopy.realmSet$lat(realmSource.realmGet$lat());
        unmanagedCopy.realmSet$lon(realmSource.realmGet$lon());

        return unmanagedObject;
    }

    static com.rhinoactive.foreorder_golf_employee.models.UserLocation update(Realm realm, com.rhinoactive.foreorder_golf_employee.models.UserLocation realmObject, com.rhinoactive.foreorder_golf_employee.models.UserLocation newObject, Map<RealmModel, RealmObjectProxy> cache) {
        UserLocationRealmProxyInterface realmObjectTarget = (UserLocationRealmProxyInterface) realmObject;
        UserLocationRealmProxyInterface realmObjectSource = (UserLocationRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$lat(realmObjectSource.realmGet$lat());
        realmObjectTarget.realmSet$lon(realmObjectSource.realmGet$lon());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("UserLocation = proxy[");
        stringBuilder.append("{userId:");
        stringBuilder.append(realmGet$userId() != null ? realmGet$userId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lat:");
        stringBuilder.append(realmGet$lat() != null ? realmGet$lat() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lon:");
        stringBuilder.append(realmGet$lon() != null ? realmGet$lon() : "null");
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
        UserLocationRealmProxy aUserLocation = (UserLocationRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aUserLocation.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUserLocation.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aUserLocation.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
