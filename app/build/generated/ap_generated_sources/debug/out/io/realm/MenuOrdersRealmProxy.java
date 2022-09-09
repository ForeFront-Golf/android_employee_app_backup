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
public class MenuOrdersRealmProxy extends com.rhinoactive.foreorder_golf_employee.models.MenuOrders
    implements RealmObjectProxy, MenuOrdersRealmProxyInterface {

    static final class MenuOrdersColumnInfo extends ColumnInfo {
        long menuOrdersIdIndex;
        long menuIndex;
        long ordersIndex;

        MenuOrdersColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("MenuOrders");
            this.menuOrdersIdIndex = addColumnDetails("menuOrdersId", objectSchemaInfo);
            this.menuIndex = addColumnDetails("menu", objectSchemaInfo);
            this.ordersIndex = addColumnDetails("orders", objectSchemaInfo);
        }

        MenuOrdersColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MenuOrdersColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MenuOrdersColumnInfo src = (MenuOrdersColumnInfo) rawSrc;
            final MenuOrdersColumnInfo dst = (MenuOrdersColumnInfo) rawDst;
            dst.menuOrdersIdIndex = src.menuOrdersIdIndex;
            dst.menuIndex = src.menuIndex;
            dst.ordersIndex = src.ordersIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(3);
        fieldNames.add("menuOrdersId");
        fieldNames.add("menu");
        fieldNames.add("orders");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private MenuOrdersColumnInfo columnInfo;
    private ProxyState<com.rhinoactive.foreorder_golf_employee.models.MenuOrders> proxyState;
    private RealmList<com.rhinoactive.foreorder_golf_employee.models.Order> ordersRealmList;

    MenuOrdersRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MenuOrdersColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.rhinoactive.foreorder_golf_employee.models.MenuOrders>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$menuOrdersId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.menuOrdersIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.menuOrdersIdIndex);
    }

    @Override
    public void realmSet$menuOrdersId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'menuOrdersId' cannot be changed after object was created.");
    }

    @Override
    public com.rhinoactive.foreorder_golf_employee.models.Menu realmGet$menu() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.menuIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.rhinoactive.foreorder_golf_employee.models.Menu.class, proxyState.getRow$realm().getLink(columnInfo.menuIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$menu(com.rhinoactive.foreorder_golf_employee.models.Menu value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("menu")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.menuIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.menuIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.menuIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.menuIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    public RealmList<com.rhinoactive.foreorder_golf_employee.models.Order> realmGet$orders() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (ordersRealmList != null) {
            return ordersRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.ordersIndex);
            ordersRealmList = new RealmList<com.rhinoactive.foreorder_golf_employee.models.Order>(com.rhinoactive.foreorder_golf_employee.models.Order.class, osList, proxyState.getRealm$realm());
            return ordersRealmList;
        }
    }

    @Override
    public void realmSet$orders(RealmList<com.rhinoactive.foreorder_golf_employee.models.Order> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("orders")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.rhinoactive.foreorder_golf_employee.models.Order> original = value;
                value = new RealmList<com.rhinoactive.foreorder_golf_employee.models.Order>();
                for (com.rhinoactive.foreorder_golf_employee.models.Order item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.ordersIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.rhinoactive.foreorder_golf_employee.models.Order linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.rhinoactive.foreorder_golf_employee.models.Order linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("MenuOrders", 3, 0);
        builder.addPersistedProperty("menuOrdersId", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("menu", RealmFieldType.OBJECT, "Menu");
        builder.addPersistedLinkProperty("orders", RealmFieldType.LIST, "Order");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MenuOrdersColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MenuOrdersColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "MenuOrders";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.rhinoactive.foreorder_golf_employee.models.MenuOrders createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        com.rhinoactive.foreorder_golf_employee.models.MenuOrders obj = null;
        if (update) {
            Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class);
            MenuOrdersColumnInfo columnInfo = (MenuOrdersColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class);
            long pkColumnIndex = columnInfo.menuOrdersIdIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("menuOrdersId")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("menuOrdersId"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class), false, Collections.<String> emptyList());
                    obj = new io.realm.MenuOrdersRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("menu")) {
                excludeFields.add("menu");
            }
            if (json.has("orders")) {
                excludeFields.add("orders");
            }
            if (json.has("menuOrdersId")) {
                if (json.isNull("menuOrdersId")) {
                    obj = (io.realm.MenuOrdersRealmProxy) realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.MenuOrdersRealmProxy) realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class, json.getInt("menuOrdersId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'menuOrdersId'.");
            }
        }

        final MenuOrdersRealmProxyInterface objProxy = (MenuOrdersRealmProxyInterface) obj;
        if (json.has("menu")) {
            if (json.isNull("menu")) {
                objProxy.realmSet$menu(null);
            } else {
                com.rhinoactive.foreorder_golf_employee.models.Menu menuObj = MenuRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("menu"), update);
                objProxy.realmSet$menu(menuObj);
            }
        }
        if (json.has("orders")) {
            if (json.isNull("orders")) {
                objProxy.realmSet$orders(null);
            } else {
                objProxy.realmGet$orders().clear();
                JSONArray array = json.getJSONArray("orders");
                for (int i = 0; i < array.length(); i++) {
                    com.rhinoactive.foreorder_golf_employee.models.Order item = OrderRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$orders().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.rhinoactive.foreorder_golf_employee.models.MenuOrders createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.rhinoactive.foreorder_golf_employee.models.MenuOrders obj = new com.rhinoactive.foreorder_golf_employee.models.MenuOrders();
        final MenuOrdersRealmProxyInterface objProxy = (MenuOrdersRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("menuOrdersId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$menuOrdersId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$menuOrdersId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("menu")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$menu(null);
                } else {
                    com.rhinoactive.foreorder_golf_employee.models.Menu menuObj = MenuRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$menu(menuObj);
                }
            } else if (name.equals("orders")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$orders(null);
                } else {
                    objProxy.realmSet$orders(new RealmList<com.rhinoactive.foreorder_golf_employee.models.Order>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.rhinoactive.foreorder_golf_employee.models.Order item = OrderRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$orders().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'menuOrdersId'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.rhinoactive.foreorder_golf_employee.models.MenuOrders copyOrUpdate(Realm realm, com.rhinoactive.foreorder_golf_employee.models.MenuOrders object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.rhinoactive.foreorder_golf_employee.models.MenuOrders) cachedRealmObject;
        }

        com.rhinoactive.foreorder_golf_employee.models.MenuOrders realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class);
            MenuOrdersColumnInfo columnInfo = (MenuOrdersColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class);
            long pkColumnIndex = columnInfo.menuOrdersIdIndex;
            Number value = ((MenuOrdersRealmProxyInterface) object).realmGet$menuOrdersId();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.MenuOrdersRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.rhinoactive.foreorder_golf_employee.models.MenuOrders copy(Realm realm, com.rhinoactive.foreorder_golf_employee.models.MenuOrders newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.rhinoactive.foreorder_golf_employee.models.MenuOrders) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.rhinoactive.foreorder_golf_employee.models.MenuOrders realmObject = realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class, ((MenuOrdersRealmProxyInterface) newObject).realmGet$menuOrdersId(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        MenuOrdersRealmProxyInterface realmObjectSource = (MenuOrdersRealmProxyInterface) newObject;
        MenuOrdersRealmProxyInterface realmObjectCopy = (MenuOrdersRealmProxyInterface) realmObject;


        com.rhinoactive.foreorder_golf_employee.models.Menu menuObj = realmObjectSource.realmGet$menu();
        if (menuObj == null) {
            realmObjectCopy.realmSet$menu(null);
        } else {
            com.rhinoactive.foreorder_golf_employee.models.Menu cachemenu = (com.rhinoactive.foreorder_golf_employee.models.Menu) cache.get(menuObj);
            if (cachemenu != null) {
                realmObjectCopy.realmSet$menu(cachemenu);
            } else {
                realmObjectCopy.realmSet$menu(MenuRealmProxy.copyOrUpdate(realm, menuObj, update, cache));
            }
        }

        RealmList<com.rhinoactive.foreorder_golf_employee.models.Order> ordersList = realmObjectSource.realmGet$orders();
        if (ordersList != null) {
            RealmList<com.rhinoactive.foreorder_golf_employee.models.Order> ordersRealmList = realmObjectCopy.realmGet$orders();
            ordersRealmList.clear();
            for (int i = 0; i < ordersList.size(); i++) {
                com.rhinoactive.foreorder_golf_employee.models.Order ordersItem = ordersList.get(i);
                com.rhinoactive.foreorder_golf_employee.models.Order cacheorders = (com.rhinoactive.foreorder_golf_employee.models.Order) cache.get(ordersItem);
                if (cacheorders != null) {
                    ordersRealmList.add(cacheorders);
                } else {
                    ordersRealmList.add(OrderRealmProxy.copyOrUpdate(realm, ordersItem, update, cache));
                }
            }
        }

        return realmObject;
    }

    public static long insert(Realm realm, com.rhinoactive.foreorder_golf_employee.models.MenuOrders object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class);
        long tableNativePtr = table.getNativePtr();
        MenuOrdersColumnInfo columnInfo = (MenuOrdersColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class);
        long pkColumnIndex = columnInfo.menuOrdersIdIndex;
        Object primaryKeyValue = ((MenuOrdersRealmProxyInterface) object).realmGet$menuOrdersId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MenuOrdersRealmProxyInterface) object).realmGet$menuOrdersId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MenuOrdersRealmProxyInterface) object).realmGet$menuOrdersId());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);

        com.rhinoactive.foreorder_golf_employee.models.Menu menuObj = ((MenuOrdersRealmProxyInterface) object).realmGet$menu();
        if (menuObj != null) {
            Long cachemenu = cache.get(menuObj);
            if (cachemenu == null) {
                cachemenu = MenuRealmProxy.insert(realm, menuObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.menuIndex, rowIndex, cachemenu, false);
        }

        RealmList<com.rhinoactive.foreorder_golf_employee.models.Order> ordersList = ((MenuOrdersRealmProxyInterface) object).realmGet$orders();
        if (ordersList != null) {
            OsList ordersOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.ordersIndex);
            for (com.rhinoactive.foreorder_golf_employee.models.Order ordersItem : ordersList) {
                Long cacheItemIndexorders = cache.get(ordersItem);
                if (cacheItemIndexorders == null) {
                    cacheItemIndexorders = OrderRealmProxy.insert(realm, ordersItem, cache);
                }
                ordersOsList.addRow(cacheItemIndexorders);
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class);
        long tableNativePtr = table.getNativePtr();
        MenuOrdersColumnInfo columnInfo = (MenuOrdersColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class);
        long pkColumnIndex = columnInfo.menuOrdersIdIndex;
        com.rhinoactive.foreorder_golf_employee.models.MenuOrders object = null;
        while (objects.hasNext()) {
            object = (com.rhinoactive.foreorder_golf_employee.models.MenuOrders) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((MenuOrdersRealmProxyInterface) object).realmGet$menuOrdersId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MenuOrdersRealmProxyInterface) object).realmGet$menuOrdersId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MenuOrdersRealmProxyInterface) object).realmGet$menuOrdersId());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);

            com.rhinoactive.foreorder_golf_employee.models.Menu menuObj = ((MenuOrdersRealmProxyInterface) object).realmGet$menu();
            if (menuObj != null) {
                Long cachemenu = cache.get(menuObj);
                if (cachemenu == null) {
                    cachemenu = MenuRealmProxy.insert(realm, menuObj, cache);
                }
                table.setLink(columnInfo.menuIndex, rowIndex, cachemenu, false);
            }

            RealmList<com.rhinoactive.foreorder_golf_employee.models.Order> ordersList = ((MenuOrdersRealmProxyInterface) object).realmGet$orders();
            if (ordersList != null) {
                OsList ordersOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.ordersIndex);
                for (com.rhinoactive.foreorder_golf_employee.models.Order ordersItem : ordersList) {
                    Long cacheItemIndexorders = cache.get(ordersItem);
                    if (cacheItemIndexorders == null) {
                        cacheItemIndexorders = OrderRealmProxy.insert(realm, ordersItem, cache);
                    }
                    ordersOsList.addRow(cacheItemIndexorders);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.rhinoactive.foreorder_golf_employee.models.MenuOrders object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class);
        long tableNativePtr = table.getNativePtr();
        MenuOrdersColumnInfo columnInfo = (MenuOrdersColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class);
        long pkColumnIndex = columnInfo.menuOrdersIdIndex;
        Object primaryKeyValue = ((MenuOrdersRealmProxyInterface) object).realmGet$menuOrdersId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MenuOrdersRealmProxyInterface) object).realmGet$menuOrdersId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MenuOrdersRealmProxyInterface) object).realmGet$menuOrdersId());
        }
        cache.put(object, rowIndex);

        com.rhinoactive.foreorder_golf_employee.models.Menu menuObj = ((MenuOrdersRealmProxyInterface) object).realmGet$menu();
        if (menuObj != null) {
            Long cachemenu = cache.get(menuObj);
            if (cachemenu == null) {
                cachemenu = MenuRealmProxy.insertOrUpdate(realm, menuObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.menuIndex, rowIndex, cachemenu, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.menuIndex, rowIndex);
        }

        OsList ordersOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.ordersIndex);
        RealmList<com.rhinoactive.foreorder_golf_employee.models.Order> ordersList = ((MenuOrdersRealmProxyInterface) object).realmGet$orders();
        if (ordersList != null && ordersList.size() == ordersOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = ordersList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinoactive.foreorder_golf_employee.models.Order ordersItem = ordersList.get(i);
                Long cacheItemIndexorders = cache.get(ordersItem);
                if (cacheItemIndexorders == null) {
                    cacheItemIndexorders = OrderRealmProxy.insertOrUpdate(realm, ordersItem, cache);
                }
                ordersOsList.setRow(i, cacheItemIndexorders);
            }
        } else {
            ordersOsList.removeAll();
            if (ordersList != null) {
                for (com.rhinoactive.foreorder_golf_employee.models.Order ordersItem : ordersList) {
                    Long cacheItemIndexorders = cache.get(ordersItem);
                    if (cacheItemIndexorders == null) {
                        cacheItemIndexorders = OrderRealmProxy.insertOrUpdate(realm, ordersItem, cache);
                    }
                    ordersOsList.addRow(cacheItemIndexorders);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class);
        long tableNativePtr = table.getNativePtr();
        MenuOrdersColumnInfo columnInfo = (MenuOrdersColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class);
        long pkColumnIndex = columnInfo.menuOrdersIdIndex;
        com.rhinoactive.foreorder_golf_employee.models.MenuOrders object = null;
        while (objects.hasNext()) {
            object = (com.rhinoactive.foreorder_golf_employee.models.MenuOrders) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((MenuOrdersRealmProxyInterface) object).realmGet$menuOrdersId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MenuOrdersRealmProxyInterface) object).realmGet$menuOrdersId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((MenuOrdersRealmProxyInterface) object).realmGet$menuOrdersId());
            }
            cache.put(object, rowIndex);

            com.rhinoactive.foreorder_golf_employee.models.Menu menuObj = ((MenuOrdersRealmProxyInterface) object).realmGet$menu();
            if (menuObj != null) {
                Long cachemenu = cache.get(menuObj);
                if (cachemenu == null) {
                    cachemenu = MenuRealmProxy.insertOrUpdate(realm, menuObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.menuIndex, rowIndex, cachemenu, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.menuIndex, rowIndex);
            }

            OsList ordersOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.ordersIndex);
            RealmList<com.rhinoactive.foreorder_golf_employee.models.Order> ordersList = ((MenuOrdersRealmProxyInterface) object).realmGet$orders();
            if (ordersList != null && ordersList.size() == ordersOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = ordersList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.rhinoactive.foreorder_golf_employee.models.Order ordersItem = ordersList.get(i);
                    Long cacheItemIndexorders = cache.get(ordersItem);
                    if (cacheItemIndexorders == null) {
                        cacheItemIndexorders = OrderRealmProxy.insertOrUpdate(realm, ordersItem, cache);
                    }
                    ordersOsList.setRow(i, cacheItemIndexorders);
                }
            } else {
                ordersOsList.removeAll();
                if (ordersList != null) {
                    for (com.rhinoactive.foreorder_golf_employee.models.Order ordersItem : ordersList) {
                        Long cacheItemIndexorders = cache.get(ordersItem);
                        if (cacheItemIndexorders == null) {
                            cacheItemIndexorders = OrderRealmProxy.insertOrUpdate(realm, ordersItem, cache);
                        }
                        ordersOsList.addRow(cacheItemIndexorders);
                    }
                }
            }

        }
    }

    public static com.rhinoactive.foreorder_golf_employee.models.MenuOrders createDetachedCopy(com.rhinoactive.foreorder_golf_employee.models.MenuOrders realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.rhinoactive.foreorder_golf_employee.models.MenuOrders unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.rhinoactive.foreorder_golf_employee.models.MenuOrders();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.rhinoactive.foreorder_golf_employee.models.MenuOrders) cachedObject.object;
            }
            unmanagedObject = (com.rhinoactive.foreorder_golf_employee.models.MenuOrders) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        MenuOrdersRealmProxyInterface unmanagedCopy = (MenuOrdersRealmProxyInterface) unmanagedObject;
        MenuOrdersRealmProxyInterface realmSource = (MenuOrdersRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$menuOrdersId(realmSource.realmGet$menuOrdersId());

        // Deep copy of menu
        unmanagedCopy.realmSet$menu(MenuRealmProxy.createDetachedCopy(realmSource.realmGet$menu(), currentDepth + 1, maxDepth, cache));

        // Deep copy of orders
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$orders(null);
        } else {
            RealmList<com.rhinoactive.foreorder_golf_employee.models.Order> managedordersList = realmSource.realmGet$orders();
            RealmList<com.rhinoactive.foreorder_golf_employee.models.Order> unmanagedordersList = new RealmList<com.rhinoactive.foreorder_golf_employee.models.Order>();
            unmanagedCopy.realmSet$orders(unmanagedordersList);
            int nextDepth = currentDepth + 1;
            int size = managedordersList.size();
            for (int i = 0; i < size; i++) {
                com.rhinoactive.foreorder_golf_employee.models.Order item = OrderRealmProxy.createDetachedCopy(managedordersList.get(i), nextDepth, maxDepth, cache);
                unmanagedordersList.add(item);
            }
        }

        return unmanagedObject;
    }

    static com.rhinoactive.foreorder_golf_employee.models.MenuOrders update(Realm realm, com.rhinoactive.foreorder_golf_employee.models.MenuOrders realmObject, com.rhinoactive.foreorder_golf_employee.models.MenuOrders newObject, Map<RealmModel, RealmObjectProxy> cache) {
        MenuOrdersRealmProxyInterface realmObjectTarget = (MenuOrdersRealmProxyInterface) realmObject;
        MenuOrdersRealmProxyInterface realmObjectSource = (MenuOrdersRealmProxyInterface) newObject;
        com.rhinoactive.foreorder_golf_employee.models.Menu menuObj = realmObjectSource.realmGet$menu();
        if (menuObj == null) {
            realmObjectTarget.realmSet$menu(null);
        } else {
            com.rhinoactive.foreorder_golf_employee.models.Menu cachemenu = (com.rhinoactive.foreorder_golf_employee.models.Menu) cache.get(menuObj);
            if (cachemenu != null) {
                realmObjectTarget.realmSet$menu(cachemenu);
            } else {
                realmObjectTarget.realmSet$menu(MenuRealmProxy.copyOrUpdate(realm, menuObj, true, cache));
            }
        }
        RealmList<com.rhinoactive.foreorder_golf_employee.models.Order> ordersList = realmObjectSource.realmGet$orders();
        RealmList<com.rhinoactive.foreorder_golf_employee.models.Order> ordersRealmList = realmObjectTarget.realmGet$orders();
        if (ordersList != null && ordersList.size() == ordersRealmList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = ordersList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinoactive.foreorder_golf_employee.models.Order ordersItem = ordersList.get(i);
                com.rhinoactive.foreorder_golf_employee.models.Order cacheorders = (com.rhinoactive.foreorder_golf_employee.models.Order) cache.get(ordersItem);
                if (cacheorders != null) {
                    ordersRealmList.set(i, cacheorders);
                } else {
                    ordersRealmList.set(i, OrderRealmProxy.copyOrUpdate(realm, ordersItem, true, cache));
                }
            }
        } else {
            ordersRealmList.clear();
            if (ordersList != null) {
                for (int i = 0; i < ordersList.size(); i++) {
                    com.rhinoactive.foreorder_golf_employee.models.Order ordersItem = ordersList.get(i);
                    com.rhinoactive.foreorder_golf_employee.models.Order cacheorders = (com.rhinoactive.foreorder_golf_employee.models.Order) cache.get(ordersItem);
                    if (cacheorders != null) {
                        ordersRealmList.add(cacheorders);
                    } else {
                        ordersRealmList.add(OrderRealmProxy.copyOrUpdate(realm, ordersItem, true, cache));
                    }
                }
            }
        }
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("MenuOrders = proxy[");
        stringBuilder.append("{menuOrdersId:");
        stringBuilder.append(realmGet$menuOrdersId() != null ? realmGet$menuOrdersId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{menu:");
        stringBuilder.append(realmGet$menu() != null ? "Menu" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{orders:");
        stringBuilder.append("RealmList<Order>[").append(realmGet$orders().size()).append("]");
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
        MenuOrdersRealmProxy aMenuOrders = (MenuOrdersRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aMenuOrders.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMenuOrders.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aMenuOrders.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
