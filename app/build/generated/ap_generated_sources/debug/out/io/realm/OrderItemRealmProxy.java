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
public class OrderItemRealmProxy extends com.rhinoactive.foreorder_golf_employee.models.OrderItem
    implements RealmObjectProxy, OrderItemRealmProxyInterface {

    static final class OrderItemColumnInfo extends ColumnInfo {
        long orderItemIdIndex;
        long menuItemIdIndex;
        long modifiedAtIndex;
        long orderIdIndex;
        long nameIndex;
        long orderOptionsIndex;
        long priceIndex;
        long specialRequestIndex;
        long quantityIndex;
        long validIndex;

        OrderItemColumnInfo(OsSchemaInfo schemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("OrderItem");
            this.orderItemIdIndex = addColumnDetails("orderItemId", objectSchemaInfo);
            this.menuItemIdIndex = addColumnDetails("menuItemId", objectSchemaInfo);
            this.modifiedAtIndex = addColumnDetails("modifiedAt", objectSchemaInfo);
            this.orderIdIndex = addColumnDetails("orderId", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", objectSchemaInfo);
            this.orderOptionsIndex = addColumnDetails("orderOptions", objectSchemaInfo);
            this.priceIndex = addColumnDetails("price", objectSchemaInfo);
            this.specialRequestIndex = addColumnDetails("specialRequest", objectSchemaInfo);
            this.quantityIndex = addColumnDetails("quantity", objectSchemaInfo);
            this.validIndex = addColumnDetails("valid", objectSchemaInfo);
        }

        OrderItemColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new OrderItemColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final OrderItemColumnInfo src = (OrderItemColumnInfo) rawSrc;
            final OrderItemColumnInfo dst = (OrderItemColumnInfo) rawDst;
            dst.orderItemIdIndex = src.orderItemIdIndex;
            dst.menuItemIdIndex = src.menuItemIdIndex;
            dst.modifiedAtIndex = src.modifiedAtIndex;
            dst.orderIdIndex = src.orderIdIndex;
            dst.nameIndex = src.nameIndex;
            dst.orderOptionsIndex = src.orderOptionsIndex;
            dst.priceIndex = src.priceIndex;
            dst.specialRequestIndex = src.specialRequestIndex;
            dst.quantityIndex = src.quantityIndex;
            dst.validIndex = src.validIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(10);
        fieldNames.add("orderItemId");
        fieldNames.add("menuItemId");
        fieldNames.add("modifiedAt");
        fieldNames.add("orderId");
        fieldNames.add("name");
        fieldNames.add("orderOptions");
        fieldNames.add("price");
        fieldNames.add("specialRequest");
        fieldNames.add("quantity");
        fieldNames.add("valid");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private OrderItemColumnInfo columnInfo;
    private ProxyState<com.rhinoactive.foreorder_golf_employee.models.OrderItem> proxyState;
    private RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption> orderOptionsRealmList;

    OrderItemRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (OrderItemColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.rhinoactive.foreorder_golf_employee.models.OrderItem>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$orderItemId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.orderItemIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.orderItemIdIndex);
    }

    @Override
    public void realmSet$orderItemId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'orderItemId' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$menuItemId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.menuItemIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.menuItemIdIndex);
    }

    @Override
    public void realmSet$menuItemId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.menuItemIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.menuItemIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.menuItemIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.menuItemIdIndex, value);
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
    public Integer realmGet$orderId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.orderIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.orderIdIndex);
    }

    @Override
    public void realmSet$orderId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.orderIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.orderIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.orderIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.orderIdIndex, value);
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
    public RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption> realmGet$orderOptions() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (orderOptionsRealmList != null) {
            return orderOptionsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.orderOptionsIndex);
            orderOptionsRealmList = new RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption>(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class, osList, proxyState.getRealm$realm());
            return orderOptionsRealmList;
        }
    }

    @Override
    public void realmSet$orderOptions(RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("orderOptions")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption> original = value;
                value = new RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption>();
                for (com.rhinoactive.foreorder_golf_employee.models.OrderOption item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.orderOptionsIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.rhinoactive.foreorder_golf_employee.models.OrderOption linkedObject = value.get(i);
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
                com.rhinoactive.foreorder_golf_employee.models.OrderOption linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
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
    public String realmGet$specialRequest() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.specialRequestIndex);
    }

    @Override
    public void realmSet$specialRequest(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.specialRequestIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.specialRequestIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.specialRequestIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.specialRequestIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$quantity() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.quantityIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.quantityIndex);
    }

    @Override
    public void realmSet$quantity(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.quantityIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.quantityIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.quantityIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.quantityIndex, value);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("OrderItem", 10, 0);
        builder.addPersistedProperty("orderItemId", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("menuItemId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("modifiedAt", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("orderId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("orderOptions", RealmFieldType.LIST, "OrderOption");
        builder.addPersistedProperty("price", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("specialRequest", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("quantity", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("valid", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static OrderItemColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new OrderItemColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "OrderItem";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.rhinoactive.foreorder_golf_employee.models.OrderItem createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.rhinoactive.foreorder_golf_employee.models.OrderItem obj = null;
        if (update) {
            Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class);
            OrderItemColumnInfo columnInfo = (OrderItemColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class);
            long pkColumnIndex = columnInfo.orderItemIdIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("orderItemId")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("orderItemId"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class), false, Collections.<String> emptyList());
                    obj = new io.realm.OrderItemRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("orderOptions")) {
                excludeFields.add("orderOptions");
            }
            if (json.has("orderItemId")) {
                if (json.isNull("orderItemId")) {
                    obj = (io.realm.OrderItemRealmProxy) realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.OrderItemRealmProxy) realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class, json.getInt("orderItemId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'orderItemId'.");
            }
        }

        final OrderItemRealmProxyInterface objProxy = (OrderItemRealmProxyInterface) obj;
        if (json.has("menuItemId")) {
            if (json.isNull("menuItemId")) {
                objProxy.realmSet$menuItemId(null);
            } else {
                objProxy.realmSet$menuItemId((int) json.getInt("menuItemId"));
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
        if (json.has("orderId")) {
            if (json.isNull("orderId")) {
                objProxy.realmSet$orderId(null);
            } else {
                objProxy.realmSet$orderId((int) json.getInt("orderId"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("orderOptions")) {
            if (json.isNull("orderOptions")) {
                objProxy.realmSet$orderOptions(null);
            } else {
                objProxy.realmGet$orderOptions().clear();
                JSONArray array = json.getJSONArray("orderOptions");
                for (int i = 0; i < array.length(); i++) {
                    com.rhinoactive.foreorder_golf_employee.models.OrderOption item = OrderOptionRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$orderOptions().add(item);
                }
            }
        }
        if (json.has("price")) {
            if (json.isNull("price")) {
                objProxy.realmSet$price(null);
            } else {
                objProxy.realmSet$price((float) json.getDouble("price"));
            }
        }
        if (json.has("specialRequest")) {
            if (json.isNull("specialRequest")) {
                objProxy.realmSet$specialRequest(null);
            } else {
                objProxy.realmSet$specialRequest((String) json.getString("specialRequest"));
            }
        }
        if (json.has("quantity")) {
            if (json.isNull("quantity")) {
                objProxy.realmSet$quantity(null);
            } else {
                objProxy.realmSet$quantity((int) json.getInt("quantity"));
            }
        }
        if (json.has("valid")) {
            if (json.isNull("valid")) {
                objProxy.realmSet$valid(null);
            } else {
                objProxy.realmSet$valid((boolean) json.getBoolean("valid"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.rhinoactive.foreorder_golf_employee.models.OrderItem createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.rhinoactive.foreorder_golf_employee.models.OrderItem obj = new com.rhinoactive.foreorder_golf_employee.models.OrderItem();
        final OrderItemRealmProxyInterface objProxy = (OrderItemRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("orderItemId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$orderItemId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$orderItemId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("menuItemId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$menuItemId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$menuItemId(null);
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
            } else if (name.equals("orderId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$orderId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$orderId(null);
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("orderOptions")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$orderOptions(null);
                } else {
                    objProxy.realmSet$orderOptions(new RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.rhinoactive.foreorder_golf_employee.models.OrderOption item = OrderOptionRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$orderOptions().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("price")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$price((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$price(null);
                }
            } else if (name.equals("specialRequest")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$specialRequest((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$specialRequest(null);
                }
            } else if (name.equals("quantity")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$quantity((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$quantity(null);
                }
            } else if (name.equals("valid")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$valid((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$valid(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'orderItemId'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.rhinoactive.foreorder_golf_employee.models.OrderItem copyOrUpdate(Realm realm, com.rhinoactive.foreorder_golf_employee.models.OrderItem object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.rhinoactive.foreorder_golf_employee.models.OrderItem) cachedRealmObject;
        }

        com.rhinoactive.foreorder_golf_employee.models.OrderItem realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class);
            OrderItemColumnInfo columnInfo = (OrderItemColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class);
            long pkColumnIndex = columnInfo.orderItemIdIndex;
            Number value = ((OrderItemRealmProxyInterface) object).realmGet$orderItemId();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.OrderItemRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.rhinoactive.foreorder_golf_employee.models.OrderItem copy(Realm realm, com.rhinoactive.foreorder_golf_employee.models.OrderItem newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.rhinoactive.foreorder_golf_employee.models.OrderItem) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.rhinoactive.foreorder_golf_employee.models.OrderItem realmObject = realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class, ((OrderItemRealmProxyInterface) newObject).realmGet$orderItemId(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        OrderItemRealmProxyInterface realmObjectSource = (OrderItemRealmProxyInterface) newObject;
        OrderItemRealmProxyInterface realmObjectCopy = (OrderItemRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$menuItemId(realmObjectSource.realmGet$menuItemId());
        realmObjectCopy.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        realmObjectCopy.realmSet$orderId(realmObjectSource.realmGet$orderId());
        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());

        RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption> orderOptionsList = realmObjectSource.realmGet$orderOptions();
        if (orderOptionsList != null) {
            RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption> orderOptionsRealmList = realmObjectCopy.realmGet$orderOptions();
            orderOptionsRealmList.clear();
            for (int i = 0; i < orderOptionsList.size(); i++) {
                com.rhinoactive.foreorder_golf_employee.models.OrderOption orderOptionsItem = orderOptionsList.get(i);
                com.rhinoactive.foreorder_golf_employee.models.OrderOption cacheorderOptions = (com.rhinoactive.foreorder_golf_employee.models.OrderOption) cache.get(orderOptionsItem);
                if (cacheorderOptions != null) {
                    orderOptionsRealmList.add(cacheorderOptions);
                } else {
                    orderOptionsRealmList.add(OrderOptionRealmProxy.copyOrUpdate(realm, orderOptionsItem, update, cache));
                }
            }
        }

        realmObjectCopy.realmSet$price(realmObjectSource.realmGet$price());
        realmObjectCopy.realmSet$specialRequest(realmObjectSource.realmGet$specialRequest());
        realmObjectCopy.realmSet$quantity(realmObjectSource.realmGet$quantity());
        realmObjectCopy.realmSet$valid(realmObjectSource.realmGet$valid());
        return realmObject;
    }

    public static long insert(Realm realm, com.rhinoactive.foreorder_golf_employee.models.OrderItem object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class);
        long tableNativePtr = table.getNativePtr();
        OrderItemColumnInfo columnInfo = (OrderItemColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class);
        long pkColumnIndex = columnInfo.orderItemIdIndex;
        Object primaryKeyValue = ((OrderItemRealmProxyInterface) object).realmGet$orderItemId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((OrderItemRealmProxyInterface) object).realmGet$orderItemId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((OrderItemRealmProxyInterface) object).realmGet$orderItemId());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Number realmGet$menuItemId = ((OrderItemRealmProxyInterface) object).realmGet$menuItemId();
        if (realmGet$menuItemId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.menuItemIdIndex, rowIndex, realmGet$menuItemId.longValue(), false);
        }
        java.util.Date realmGet$modifiedAt = ((OrderItemRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        }
        Number realmGet$orderId = ((OrderItemRealmProxyInterface) object).realmGet$orderId();
        if (realmGet$orderId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.orderIdIndex, rowIndex, realmGet$orderId.longValue(), false);
        }
        String realmGet$name = ((OrderItemRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }

        RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption> orderOptionsList = ((OrderItemRealmProxyInterface) object).realmGet$orderOptions();
        if (orderOptionsList != null) {
            OsList orderOptionsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.orderOptionsIndex);
            for (com.rhinoactive.foreorder_golf_employee.models.OrderOption orderOptionsItem : orderOptionsList) {
                Long cacheItemIndexorderOptions = cache.get(orderOptionsItem);
                if (cacheItemIndexorderOptions == null) {
                    cacheItemIndexorderOptions = OrderOptionRealmProxy.insert(realm, orderOptionsItem, cache);
                }
                orderOptionsOsList.addRow(cacheItemIndexorderOptions);
            }
        }
        Float realmGet$price = ((OrderItemRealmProxyInterface) object).realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.priceIndex, rowIndex, realmGet$price, false);
        }
        String realmGet$specialRequest = ((OrderItemRealmProxyInterface) object).realmGet$specialRequest();
        if (realmGet$specialRequest != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.specialRequestIndex, rowIndex, realmGet$specialRequest, false);
        }
        Number realmGet$quantity = ((OrderItemRealmProxyInterface) object).realmGet$quantity();
        if (realmGet$quantity != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.quantityIndex, rowIndex, realmGet$quantity.longValue(), false);
        }
        Boolean realmGet$valid = ((OrderItemRealmProxyInterface) object).realmGet$valid();
        if (realmGet$valid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class);
        long tableNativePtr = table.getNativePtr();
        OrderItemColumnInfo columnInfo = (OrderItemColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class);
        long pkColumnIndex = columnInfo.orderItemIdIndex;
        com.rhinoactive.foreorder_golf_employee.models.OrderItem object = null;
        while (objects.hasNext()) {
            object = (com.rhinoactive.foreorder_golf_employee.models.OrderItem) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((OrderItemRealmProxyInterface) object).realmGet$orderItemId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((OrderItemRealmProxyInterface) object).realmGet$orderItemId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((OrderItemRealmProxyInterface) object).realmGet$orderItemId());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Number realmGet$menuItemId = ((OrderItemRealmProxyInterface) object).realmGet$menuItemId();
            if (realmGet$menuItemId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.menuItemIdIndex, rowIndex, realmGet$menuItemId.longValue(), false);
            }
            java.util.Date realmGet$modifiedAt = ((OrderItemRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            }
            Number realmGet$orderId = ((OrderItemRealmProxyInterface) object).realmGet$orderId();
            if (realmGet$orderId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.orderIdIndex, rowIndex, realmGet$orderId.longValue(), false);
            }
            String realmGet$name = ((OrderItemRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }

            RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption> orderOptionsList = ((OrderItemRealmProxyInterface) object).realmGet$orderOptions();
            if (orderOptionsList != null) {
                OsList orderOptionsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.orderOptionsIndex);
                for (com.rhinoactive.foreorder_golf_employee.models.OrderOption orderOptionsItem : orderOptionsList) {
                    Long cacheItemIndexorderOptions = cache.get(orderOptionsItem);
                    if (cacheItemIndexorderOptions == null) {
                        cacheItemIndexorderOptions = OrderOptionRealmProxy.insert(realm, orderOptionsItem, cache);
                    }
                    orderOptionsOsList.addRow(cacheItemIndexorderOptions);
                }
            }
            Float realmGet$price = ((OrderItemRealmProxyInterface) object).realmGet$price();
            if (realmGet$price != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.priceIndex, rowIndex, realmGet$price, false);
            }
            String realmGet$specialRequest = ((OrderItemRealmProxyInterface) object).realmGet$specialRequest();
            if (realmGet$specialRequest != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.specialRequestIndex, rowIndex, realmGet$specialRequest, false);
            }
            Number realmGet$quantity = ((OrderItemRealmProxyInterface) object).realmGet$quantity();
            if (realmGet$quantity != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.quantityIndex, rowIndex, realmGet$quantity.longValue(), false);
            }
            Boolean realmGet$valid = ((OrderItemRealmProxyInterface) object).realmGet$valid();
            if (realmGet$valid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.rhinoactive.foreorder_golf_employee.models.OrderItem object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class);
        long tableNativePtr = table.getNativePtr();
        OrderItemColumnInfo columnInfo = (OrderItemColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class);
        long pkColumnIndex = columnInfo.orderItemIdIndex;
        Object primaryKeyValue = ((OrderItemRealmProxyInterface) object).realmGet$orderItemId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((OrderItemRealmProxyInterface) object).realmGet$orderItemId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((OrderItemRealmProxyInterface) object).realmGet$orderItemId());
        }
        cache.put(object, rowIndex);
        Number realmGet$menuItemId = ((OrderItemRealmProxyInterface) object).realmGet$menuItemId();
        if (realmGet$menuItemId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.menuItemIdIndex, rowIndex, realmGet$menuItemId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.menuItemIdIndex, rowIndex, false);
        }
        java.util.Date realmGet$modifiedAt = ((OrderItemRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
        }
        Number realmGet$orderId = ((OrderItemRealmProxyInterface) object).realmGet$orderId();
        if (realmGet$orderId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.orderIdIndex, rowIndex, realmGet$orderId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.orderIdIndex, rowIndex, false);
        }
        String realmGet$name = ((OrderItemRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }

        OsList orderOptionsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.orderOptionsIndex);
        RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption> orderOptionsList = ((OrderItemRealmProxyInterface) object).realmGet$orderOptions();
        if (orderOptionsList != null && orderOptionsList.size() == orderOptionsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = orderOptionsList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinoactive.foreorder_golf_employee.models.OrderOption orderOptionsItem = orderOptionsList.get(i);
                Long cacheItemIndexorderOptions = cache.get(orderOptionsItem);
                if (cacheItemIndexorderOptions == null) {
                    cacheItemIndexorderOptions = OrderOptionRealmProxy.insertOrUpdate(realm, orderOptionsItem, cache);
                }
                orderOptionsOsList.setRow(i, cacheItemIndexorderOptions);
            }
        } else {
            orderOptionsOsList.removeAll();
            if (orderOptionsList != null) {
                for (com.rhinoactive.foreorder_golf_employee.models.OrderOption orderOptionsItem : orderOptionsList) {
                    Long cacheItemIndexorderOptions = cache.get(orderOptionsItem);
                    if (cacheItemIndexorderOptions == null) {
                        cacheItemIndexorderOptions = OrderOptionRealmProxy.insertOrUpdate(realm, orderOptionsItem, cache);
                    }
                    orderOptionsOsList.addRow(cacheItemIndexorderOptions);
                }
            }
        }

        Float realmGet$price = ((OrderItemRealmProxyInterface) object).realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.priceIndex, rowIndex, realmGet$price, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.priceIndex, rowIndex, false);
        }
        String realmGet$specialRequest = ((OrderItemRealmProxyInterface) object).realmGet$specialRequest();
        if (realmGet$specialRequest != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.specialRequestIndex, rowIndex, realmGet$specialRequest, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.specialRequestIndex, rowIndex, false);
        }
        Number realmGet$quantity = ((OrderItemRealmProxyInterface) object).realmGet$quantity();
        if (realmGet$quantity != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.quantityIndex, rowIndex, realmGet$quantity.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.quantityIndex, rowIndex, false);
        }
        Boolean realmGet$valid = ((OrderItemRealmProxyInterface) object).realmGet$valid();
        if (realmGet$valid != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.validIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class);
        long tableNativePtr = table.getNativePtr();
        OrderItemColumnInfo columnInfo = (OrderItemColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class);
        long pkColumnIndex = columnInfo.orderItemIdIndex;
        com.rhinoactive.foreorder_golf_employee.models.OrderItem object = null;
        while (objects.hasNext()) {
            object = (com.rhinoactive.foreorder_golf_employee.models.OrderItem) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((OrderItemRealmProxyInterface) object).realmGet$orderItemId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((OrderItemRealmProxyInterface) object).realmGet$orderItemId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((OrderItemRealmProxyInterface) object).realmGet$orderItemId());
            }
            cache.put(object, rowIndex);
            Number realmGet$menuItemId = ((OrderItemRealmProxyInterface) object).realmGet$menuItemId();
            if (realmGet$menuItemId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.menuItemIdIndex, rowIndex, realmGet$menuItemId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.menuItemIdIndex, rowIndex, false);
            }
            java.util.Date realmGet$modifiedAt = ((OrderItemRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
            }
            Number realmGet$orderId = ((OrderItemRealmProxyInterface) object).realmGet$orderId();
            if (realmGet$orderId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.orderIdIndex, rowIndex, realmGet$orderId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.orderIdIndex, rowIndex, false);
            }
            String realmGet$name = ((OrderItemRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }

            OsList orderOptionsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.orderOptionsIndex);
            RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption> orderOptionsList = ((OrderItemRealmProxyInterface) object).realmGet$orderOptions();
            if (orderOptionsList != null && orderOptionsList.size() == orderOptionsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = orderOptionsList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.rhinoactive.foreorder_golf_employee.models.OrderOption orderOptionsItem = orderOptionsList.get(i);
                    Long cacheItemIndexorderOptions = cache.get(orderOptionsItem);
                    if (cacheItemIndexorderOptions == null) {
                        cacheItemIndexorderOptions = OrderOptionRealmProxy.insertOrUpdate(realm, orderOptionsItem, cache);
                    }
                    orderOptionsOsList.setRow(i, cacheItemIndexorderOptions);
                }
            } else {
                orderOptionsOsList.removeAll();
                if (orderOptionsList != null) {
                    for (com.rhinoactive.foreorder_golf_employee.models.OrderOption orderOptionsItem : orderOptionsList) {
                        Long cacheItemIndexorderOptions = cache.get(orderOptionsItem);
                        if (cacheItemIndexorderOptions == null) {
                            cacheItemIndexorderOptions = OrderOptionRealmProxy.insertOrUpdate(realm, orderOptionsItem, cache);
                        }
                        orderOptionsOsList.addRow(cacheItemIndexorderOptions);
                    }
                }
            }

            Float realmGet$price = ((OrderItemRealmProxyInterface) object).realmGet$price();
            if (realmGet$price != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.priceIndex, rowIndex, realmGet$price, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.priceIndex, rowIndex, false);
            }
            String realmGet$specialRequest = ((OrderItemRealmProxyInterface) object).realmGet$specialRequest();
            if (realmGet$specialRequest != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.specialRequestIndex, rowIndex, realmGet$specialRequest, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.specialRequestIndex, rowIndex, false);
            }
            Number realmGet$quantity = ((OrderItemRealmProxyInterface) object).realmGet$quantity();
            if (realmGet$quantity != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.quantityIndex, rowIndex, realmGet$quantity.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.quantityIndex, rowIndex, false);
            }
            Boolean realmGet$valid = ((OrderItemRealmProxyInterface) object).realmGet$valid();
            if (realmGet$valid != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.validIndex, rowIndex, realmGet$valid, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.validIndex, rowIndex, false);
            }
        }
    }

    public static com.rhinoactive.foreorder_golf_employee.models.OrderItem createDetachedCopy(com.rhinoactive.foreorder_golf_employee.models.OrderItem realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.rhinoactive.foreorder_golf_employee.models.OrderItem unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.rhinoactive.foreorder_golf_employee.models.OrderItem();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.rhinoactive.foreorder_golf_employee.models.OrderItem) cachedObject.object;
            }
            unmanagedObject = (com.rhinoactive.foreorder_golf_employee.models.OrderItem) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        OrderItemRealmProxyInterface unmanagedCopy = (OrderItemRealmProxyInterface) unmanagedObject;
        OrderItemRealmProxyInterface realmSource = (OrderItemRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$orderItemId(realmSource.realmGet$orderItemId());
        unmanagedCopy.realmSet$menuItemId(realmSource.realmGet$menuItemId());
        unmanagedCopy.realmSet$modifiedAt(realmSource.realmGet$modifiedAt());
        unmanagedCopy.realmSet$orderId(realmSource.realmGet$orderId());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());

        // Deep copy of orderOptions
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$orderOptions(null);
        } else {
            RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption> managedorderOptionsList = realmSource.realmGet$orderOptions();
            RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption> unmanagedorderOptionsList = new RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption>();
            unmanagedCopy.realmSet$orderOptions(unmanagedorderOptionsList);
            int nextDepth = currentDepth + 1;
            int size = managedorderOptionsList.size();
            for (int i = 0; i < size; i++) {
                com.rhinoactive.foreorder_golf_employee.models.OrderOption item = OrderOptionRealmProxy.createDetachedCopy(managedorderOptionsList.get(i), nextDepth, maxDepth, cache);
                unmanagedorderOptionsList.add(item);
            }
        }
        unmanagedCopy.realmSet$price(realmSource.realmGet$price());
        unmanagedCopy.realmSet$specialRequest(realmSource.realmGet$specialRequest());
        unmanagedCopy.realmSet$quantity(realmSource.realmGet$quantity());
        unmanagedCopy.realmSet$valid(realmSource.realmGet$valid());

        return unmanagedObject;
    }

    static com.rhinoactive.foreorder_golf_employee.models.OrderItem update(Realm realm, com.rhinoactive.foreorder_golf_employee.models.OrderItem realmObject, com.rhinoactive.foreorder_golf_employee.models.OrderItem newObject, Map<RealmModel, RealmObjectProxy> cache) {
        OrderItemRealmProxyInterface realmObjectTarget = (OrderItemRealmProxyInterface) realmObject;
        OrderItemRealmProxyInterface realmObjectSource = (OrderItemRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$menuItemId(realmObjectSource.realmGet$menuItemId());
        realmObjectTarget.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        realmObjectTarget.realmSet$orderId(realmObjectSource.realmGet$orderId());
        realmObjectTarget.realmSet$name(realmObjectSource.realmGet$name());
        RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption> orderOptionsList = realmObjectSource.realmGet$orderOptions();
        RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderOption> orderOptionsRealmList = realmObjectTarget.realmGet$orderOptions();
        if (orderOptionsList != null && orderOptionsList.size() == orderOptionsRealmList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = orderOptionsList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinoactive.foreorder_golf_employee.models.OrderOption orderOptionsItem = orderOptionsList.get(i);
                com.rhinoactive.foreorder_golf_employee.models.OrderOption cacheorderOptions = (com.rhinoactive.foreorder_golf_employee.models.OrderOption) cache.get(orderOptionsItem);
                if (cacheorderOptions != null) {
                    orderOptionsRealmList.set(i, cacheorderOptions);
                } else {
                    orderOptionsRealmList.set(i, OrderOptionRealmProxy.copyOrUpdate(realm, orderOptionsItem, true, cache));
                }
            }
        } else {
            orderOptionsRealmList.clear();
            if (orderOptionsList != null) {
                for (int i = 0; i < orderOptionsList.size(); i++) {
                    com.rhinoactive.foreorder_golf_employee.models.OrderOption orderOptionsItem = orderOptionsList.get(i);
                    com.rhinoactive.foreorder_golf_employee.models.OrderOption cacheorderOptions = (com.rhinoactive.foreorder_golf_employee.models.OrderOption) cache.get(orderOptionsItem);
                    if (cacheorderOptions != null) {
                        orderOptionsRealmList.add(cacheorderOptions);
                    } else {
                        orderOptionsRealmList.add(OrderOptionRealmProxy.copyOrUpdate(realm, orderOptionsItem, true, cache));
                    }
                }
            }
        }
        realmObjectTarget.realmSet$price(realmObjectSource.realmGet$price());
        realmObjectTarget.realmSet$specialRequest(realmObjectSource.realmGet$specialRequest());
        realmObjectTarget.realmSet$quantity(realmObjectSource.realmGet$quantity());
        realmObjectTarget.realmSet$valid(realmObjectSource.realmGet$valid());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("OrderItem = proxy[");
        stringBuilder.append("{orderItemId:");
        stringBuilder.append(realmGet$orderItemId() != null ? realmGet$orderItemId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{menuItemId:");
        stringBuilder.append(realmGet$menuItemId() != null ? realmGet$menuItemId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{modifiedAt:");
        stringBuilder.append(realmGet$modifiedAt() != null ? realmGet$modifiedAt() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{orderId:");
        stringBuilder.append(realmGet$orderId() != null ? realmGet$orderId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{orderOptions:");
        stringBuilder.append("RealmList<OrderOption>[").append(realmGet$orderOptions().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{price:");
        stringBuilder.append(realmGet$price() != null ? realmGet$price() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{specialRequest:");
        stringBuilder.append(realmGet$specialRequest() != null ? realmGet$specialRequest() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{quantity:");
        stringBuilder.append(realmGet$quantity() != null ? realmGet$quantity() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{valid:");
        stringBuilder.append(realmGet$valid() != null ? realmGet$valid() : "null");
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
        OrderItemRealmProxy aOrderItem = (OrderItemRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aOrderItem.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aOrderItem.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aOrderItem.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
