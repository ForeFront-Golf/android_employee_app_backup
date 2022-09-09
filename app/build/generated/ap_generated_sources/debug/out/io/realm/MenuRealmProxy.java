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
public class MenuRealmProxy extends com.rhinoactive.foreorder_golf_employee.models.Menu
    implements RealmObjectProxy, MenuRealmProxyInterface {

    static final class MenuColumnInfo extends ColumnInfo {
        long menuIdIndex;
        long nameIndex;
        long descIndex;
        long clubIdIndex;
        long modifiedAtIndex;
        long selectedIndex;

        MenuColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Menu");
            this.menuIdIndex = addColumnDetails("menuId", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", objectSchemaInfo);
            this.descIndex = addColumnDetails("desc", objectSchemaInfo);
            this.clubIdIndex = addColumnDetails("clubId", objectSchemaInfo);
            this.modifiedAtIndex = addColumnDetails("modifiedAt", objectSchemaInfo);
            this.selectedIndex = addColumnDetails("selected", objectSchemaInfo);
        }

        MenuColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MenuColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MenuColumnInfo src = (MenuColumnInfo) rawSrc;
            final MenuColumnInfo dst = (MenuColumnInfo) rawDst;
            dst.menuIdIndex = src.menuIdIndex;
            dst.nameIndex = src.nameIndex;
            dst.descIndex = src.descIndex;
            dst.clubIdIndex = src.clubIdIndex;
            dst.modifiedAtIndex = src.modifiedAtIndex;
            dst.selectedIndex = src.selectedIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(6);
        fieldNames.add("menuId");
        fieldNames.add("name");
        fieldNames.add("desc");
        fieldNames.add("clubId");
        fieldNames.add("modifiedAt");
        fieldNames.add("selected");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private MenuColumnInfo columnInfo;
    private ProxyState<com.rhinoactive.foreorder_golf_employee.models.Menu> proxyState;

    MenuRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MenuColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.rhinoactive.foreorder_golf_employee.models.Menu>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$menuId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.menuIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.menuIdIndex);
    }

    @Override
    public void realmSet$menuId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'menuId' cannot be changed after object was created.");
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
    public Integer realmGet$clubId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.clubIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.clubIdIndex);
    }

    @Override
    public void realmSet$clubId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.clubIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.clubIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.clubIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.clubIdIndex, value);
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

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$selected() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.selectedIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.selectedIndex);
    }

    @Override
    public void realmSet$selected(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.selectedIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.selectedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.selectedIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.selectedIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Menu", 6, 0);
        builder.addPersistedProperty("menuId", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("desc", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("clubId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("modifiedAt", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("selected", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MenuColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MenuColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Menu";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.rhinoactive.foreorder_golf_employee.models.Menu createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.rhinoactive.foreorder_golf_employee.models.Menu obj = null;
        if (update) {
            Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.Menu.class);
            MenuColumnInfo columnInfo = (MenuColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.Menu.class);
            long pkColumnIndex = columnInfo.menuIdIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("menuId")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("menuId"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.Menu.class), false, Collections.<String> emptyList());
                    obj = new io.realm.MenuRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("menuId")) {
                if (json.isNull("menuId")) {
                    obj = (io.realm.MenuRealmProxy) realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.Menu.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.MenuRealmProxy) realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.Menu.class, json.getInt("menuId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'menuId'.");
            }
        }

        final MenuRealmProxyInterface objProxy = (MenuRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("desc")) {
            if (json.isNull("desc")) {
                objProxy.realmSet$desc(null);
            } else {
                objProxy.realmSet$desc((String) json.getString("desc"));
            }
        }
        if (json.has("clubId")) {
            if (json.isNull("clubId")) {
                objProxy.realmSet$clubId(null);
            } else {
                objProxy.realmSet$clubId((int) json.getInt("clubId"));
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
        if (json.has("selected")) {
            if (json.isNull("selected")) {
                objProxy.realmSet$selected(null);
            } else {
                objProxy.realmSet$selected((boolean) json.getBoolean("selected"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.rhinoactive.foreorder_golf_employee.models.Menu createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.rhinoactive.foreorder_golf_employee.models.Menu obj = new com.rhinoactive.foreorder_golf_employee.models.Menu();
        final MenuRealmProxyInterface objProxy = (MenuRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("menuId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$menuId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$menuId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("desc")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$desc((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$desc(null);
                }
            } else if (name.equals("clubId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$clubId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$clubId(null);
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
            } else if (name.equals("selected")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$selected((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$selected(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'menuId'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.rhinoactive.foreorder_golf_employee.models.Menu copyOrUpdate(Realm realm, com.rhinoactive.foreorder_golf_employee.models.Menu object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.rhinoactive.foreorder_golf_employee.models.Menu) cachedRealmObject;
        }

        com.rhinoactive.foreorder_golf_employee.models.Menu realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.Menu.class);
            MenuColumnInfo columnInfo = (MenuColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.Menu.class);
            long pkColumnIndex = columnInfo.menuIdIndex;
            Number value = ((MenuRealmProxyInterface) object).realmGet$menuId();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.Menu.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.MenuRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.rhinoactive.foreorder_golf_employee.models.Menu copy(Realm realm, com.rhinoactive.foreorder_golf_employee.models.Menu newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.rhinoactive.foreorder_golf_employee.models.Menu) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.rhinoactive.foreorder_golf_employee.models.Menu realmObject = realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.Menu.class, ((MenuRealmProxyInterface) newObject).realmGet$menuId(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        MenuRealmProxyInterface realmObjectSource = (MenuRealmProxyInterface) newObject;
        MenuRealmProxyInterface realmObjectCopy = (MenuRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$desc(realmObjectSource.realmGet$desc());
        realmObjectCopy.realmSet$clubId(realmObjectSource.realmGet$clubId());
        realmObjectCopy.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        realmObjectCopy.realmSet$selected(realmObjectSource.realmGet$selected());
        return realmObject;
    }

    public static long insert(Realm realm, com.rhinoactive.foreorder_golf_employee.models.Menu object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.Menu.class);
        long tableNativePtr = table.getNativePtr();
        MenuColumnInfo columnInfo = (MenuColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.Menu.class);
        long pkColumnIndex = columnInfo.menuIdIndex;
        Object primaryKeyValue = ((MenuRealmProxyInterface) object).realmGet$menuId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MenuRealmProxyInterface) object).realmGet$menuId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MenuRealmProxyInterface) object).realmGet$menuId());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((MenuRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$desc = ((MenuRealmProxyInterface) object).realmGet$desc();
        if (realmGet$desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
        }
        Number realmGet$clubId = ((MenuRealmProxyInterface) object).realmGet$clubId();
        if (realmGet$clubId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.clubIdIndex, rowIndex, realmGet$clubId.longValue(), false);
        }
        java.util.Date realmGet$modifiedAt = ((MenuRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        }
        Boolean realmGet$selected = ((MenuRealmProxyInterface) object).realmGet$selected();
        if (realmGet$selected != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, realmGet$selected, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.Menu.class);
        long tableNativePtr = table.getNativePtr();
        MenuColumnInfo columnInfo = (MenuColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.Menu.class);
        long pkColumnIndex = columnInfo.menuIdIndex;
        com.rhinoactive.foreorder_golf_employee.models.Menu object = null;
        while (objects.hasNext()) {
            object = (com.rhinoactive.foreorder_golf_employee.models.Menu) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((MenuRealmProxyInterface) object).realmGet$menuId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MenuRealmProxyInterface) object).realmGet$menuId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MenuRealmProxyInterface) object).realmGet$menuId());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((MenuRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$desc = ((MenuRealmProxyInterface) object).realmGet$desc();
            if (realmGet$desc != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
            }
            Number realmGet$clubId = ((MenuRealmProxyInterface) object).realmGet$clubId();
            if (realmGet$clubId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.clubIdIndex, rowIndex, realmGet$clubId.longValue(), false);
            }
            java.util.Date realmGet$modifiedAt = ((MenuRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            }
            Boolean realmGet$selected = ((MenuRealmProxyInterface) object).realmGet$selected();
            if (realmGet$selected != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, realmGet$selected, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.rhinoactive.foreorder_golf_employee.models.Menu object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.Menu.class);
        long tableNativePtr = table.getNativePtr();
        MenuColumnInfo columnInfo = (MenuColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.Menu.class);
        long pkColumnIndex = columnInfo.menuIdIndex;
        Object primaryKeyValue = ((MenuRealmProxyInterface) object).realmGet$menuId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MenuRealmProxyInterface) object).realmGet$menuId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MenuRealmProxyInterface) object).realmGet$menuId());
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((MenuRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$desc = ((MenuRealmProxyInterface) object).realmGet$desc();
        if (realmGet$desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descIndex, rowIndex, false);
        }
        Number realmGet$clubId = ((MenuRealmProxyInterface) object).realmGet$clubId();
        if (realmGet$clubId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.clubIdIndex, rowIndex, realmGet$clubId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.clubIdIndex, rowIndex, false);
        }
        java.util.Date realmGet$modifiedAt = ((MenuRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
        }
        Boolean realmGet$selected = ((MenuRealmProxyInterface) object).realmGet$selected();
        if (realmGet$selected != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, realmGet$selected, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.selectedIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.Menu.class);
        long tableNativePtr = table.getNativePtr();
        MenuColumnInfo columnInfo = (MenuColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.Menu.class);
        long pkColumnIndex = columnInfo.menuIdIndex;
        com.rhinoactive.foreorder_golf_employee.models.Menu object = null;
        while (objects.hasNext()) {
            object = (com.rhinoactive.foreorder_golf_employee.models.Menu) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((MenuRealmProxyInterface) object).realmGet$menuId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MenuRealmProxyInterface) object).realmGet$menuId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MenuRealmProxyInterface) object).realmGet$menuId());
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((MenuRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$desc = ((MenuRealmProxyInterface) object).realmGet$desc();
            if (realmGet$desc != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.descIndex, rowIndex, false);
            }
            Number realmGet$clubId = ((MenuRealmProxyInterface) object).realmGet$clubId();
            if (realmGet$clubId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.clubIdIndex, rowIndex, realmGet$clubId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.clubIdIndex, rowIndex, false);
            }
            java.util.Date realmGet$modifiedAt = ((MenuRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
            }
            Boolean realmGet$selected = ((MenuRealmProxyInterface) object).realmGet$selected();
            if (realmGet$selected != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, realmGet$selected, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.selectedIndex, rowIndex, false);
            }
        }
    }

    public static com.rhinoactive.foreorder_golf_employee.models.Menu createDetachedCopy(com.rhinoactive.foreorder_golf_employee.models.Menu realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.rhinoactive.foreorder_golf_employee.models.Menu unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.rhinoactive.foreorder_golf_employee.models.Menu();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.rhinoactive.foreorder_golf_employee.models.Menu) cachedObject.object;
            }
            unmanagedObject = (com.rhinoactive.foreorder_golf_employee.models.Menu) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        MenuRealmProxyInterface unmanagedCopy = (MenuRealmProxyInterface) unmanagedObject;
        MenuRealmProxyInterface realmSource = (MenuRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$menuId(realmSource.realmGet$menuId());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$desc(realmSource.realmGet$desc());
        unmanagedCopy.realmSet$clubId(realmSource.realmGet$clubId());
        unmanagedCopy.realmSet$modifiedAt(realmSource.realmGet$modifiedAt());
        unmanagedCopy.realmSet$selected(realmSource.realmGet$selected());

        return unmanagedObject;
    }

    static com.rhinoactive.foreorder_golf_employee.models.Menu update(Realm realm, com.rhinoactive.foreorder_golf_employee.models.Menu realmObject, com.rhinoactive.foreorder_golf_employee.models.Menu newObject, Map<RealmModel, RealmObjectProxy> cache) {
        MenuRealmProxyInterface realmObjectTarget = (MenuRealmProxyInterface) realmObject;
        MenuRealmProxyInterface realmObjectSource = (MenuRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectTarget.realmSet$desc(realmObjectSource.realmGet$desc());
        realmObjectTarget.realmSet$clubId(realmObjectSource.realmGet$clubId());
        realmObjectTarget.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        realmObjectTarget.realmSet$selected(realmObjectSource.realmGet$selected());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Menu = proxy[");
        stringBuilder.append("{menuId:");
        stringBuilder.append(realmGet$menuId() != null ? realmGet$menuId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{desc:");
        stringBuilder.append(realmGet$desc() != null ? realmGet$desc() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{clubId:");
        stringBuilder.append(realmGet$clubId() != null ? realmGet$clubId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{modifiedAt:");
        stringBuilder.append(realmGet$modifiedAt() != null ? realmGet$modifiedAt() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{selected:");
        stringBuilder.append(realmGet$selected() != null ? realmGet$selected() : "null");
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
        MenuRealmProxy aMenu = (MenuRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aMenu.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMenu.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aMenu.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
