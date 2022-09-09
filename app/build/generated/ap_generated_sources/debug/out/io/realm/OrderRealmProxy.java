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
public class OrderRealmProxy extends com.rhinoactive.foreorder_golf_employee.models.Order
    implements RealmObjectProxy, OrderRealmProxyInterface {

    static final class OrderColumnInfo extends ColumnInfo {
        long orderIdIndex;
        long userIndex;
        long currentStateIndex;
        long orderNumIndex;
        long clubIdIndex;
        long menuIdIndex;
        long deliveryIndex;
        long fulfilledIndex;
        long priceTotalIndex;
        long priceTotalWithTaxIndex;
        long taxAmountIndex;
        long quantityIndex;
        long userIdIndex;
        long createdAtIndex;
        long modifiedAtIndex;
        long memberCodeIndex;
        long orderItemsIndex;

        OrderColumnInfo(OsSchemaInfo schemaInfo) {
            super(17);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Order");
            this.orderIdIndex = addColumnDetails("orderId", objectSchemaInfo);
            this.userIndex = addColumnDetails("user", objectSchemaInfo);
            this.currentStateIndex = addColumnDetails("currentState", objectSchemaInfo);
            this.orderNumIndex = addColumnDetails("orderNum", objectSchemaInfo);
            this.clubIdIndex = addColumnDetails("clubId", objectSchemaInfo);
            this.menuIdIndex = addColumnDetails("menuId", objectSchemaInfo);
            this.deliveryIndex = addColumnDetails("delivery", objectSchemaInfo);
            this.fulfilledIndex = addColumnDetails("fulfilled", objectSchemaInfo);
            this.priceTotalIndex = addColumnDetails("priceTotal", objectSchemaInfo);
            this.priceTotalWithTaxIndex = addColumnDetails("priceTotalWithTax", objectSchemaInfo);
            this.taxAmountIndex = addColumnDetails("taxAmount", objectSchemaInfo);
            this.quantityIndex = addColumnDetails("quantity", objectSchemaInfo);
            this.userIdIndex = addColumnDetails("userId", objectSchemaInfo);
            this.createdAtIndex = addColumnDetails("createdAt", objectSchemaInfo);
            this.modifiedAtIndex = addColumnDetails("modifiedAt", objectSchemaInfo);
            this.memberCodeIndex = addColumnDetails("memberCode", objectSchemaInfo);
            this.orderItemsIndex = addColumnDetails("orderItems", objectSchemaInfo);
        }

        OrderColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new OrderColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final OrderColumnInfo src = (OrderColumnInfo) rawSrc;
            final OrderColumnInfo dst = (OrderColumnInfo) rawDst;
            dst.orderIdIndex = src.orderIdIndex;
            dst.userIndex = src.userIndex;
            dst.currentStateIndex = src.currentStateIndex;
            dst.orderNumIndex = src.orderNumIndex;
            dst.clubIdIndex = src.clubIdIndex;
            dst.menuIdIndex = src.menuIdIndex;
            dst.deliveryIndex = src.deliveryIndex;
            dst.fulfilledIndex = src.fulfilledIndex;
            dst.priceTotalIndex = src.priceTotalIndex;
            dst.priceTotalWithTaxIndex = src.priceTotalWithTaxIndex;
            dst.taxAmountIndex = src.taxAmountIndex;
            dst.quantityIndex = src.quantityIndex;
            dst.userIdIndex = src.userIdIndex;
            dst.createdAtIndex = src.createdAtIndex;
            dst.modifiedAtIndex = src.modifiedAtIndex;
            dst.memberCodeIndex = src.memberCodeIndex;
            dst.orderItemsIndex = src.orderItemsIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(17);
        fieldNames.add("orderId");
        fieldNames.add("user");
        fieldNames.add("currentState");
        fieldNames.add("orderNum");
        fieldNames.add("clubId");
        fieldNames.add("menuId");
        fieldNames.add("delivery");
        fieldNames.add("fulfilled");
        fieldNames.add("priceTotal");
        fieldNames.add("priceTotalWithTax");
        fieldNames.add("taxAmount");
        fieldNames.add("quantity");
        fieldNames.add("userId");
        fieldNames.add("createdAt");
        fieldNames.add("modifiedAt");
        fieldNames.add("memberCode");
        fieldNames.add("orderItems");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private OrderColumnInfo columnInfo;
    private ProxyState<com.rhinoactive.foreorder_golf_employee.models.Order> proxyState;
    private RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem> orderItemsRealmList;

    OrderRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (OrderColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.rhinoactive.foreorder_golf_employee.models.Order>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'orderId' cannot be changed after object was created.");
    }

    @Override
    public com.rhinoactive.foreorder_golf_employee.models.User realmGet$user() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.userIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.rhinoactive.foreorder_golf_employee.models.User.class, proxyState.getRow$realm().getLink(columnInfo.userIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$user(com.rhinoactive.foreorder_golf_employee.models.User value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("user")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.userIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.userIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.userIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.userIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$currentState() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.currentStateIndex);
    }

    @Override
    public void realmSet$currentState(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.currentStateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.currentStateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.currentStateIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.currentStateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$orderNum() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.orderNumIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.orderNumIndex);
    }

    @Override
    public void realmSet$orderNum(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.orderNumIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.orderNumIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.orderNumIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.orderNumIndex, value);
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
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.menuIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.menuIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.menuIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.menuIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$delivery() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.deliveryIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.deliveryIndex);
    }

    @Override
    public void realmSet$delivery(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.deliveryIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.deliveryIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.deliveryIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.deliveryIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$fulfilled() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.fulfilledIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.fulfilledIndex);
    }

    @Override
    public void realmSet$fulfilled(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fulfilledIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.fulfilledIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fulfilledIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.fulfilledIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Float realmGet$priceTotal() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.priceTotalIndex)) {
            return null;
        }
        return (float) proxyState.getRow$realm().getFloat(columnInfo.priceTotalIndex);
    }

    @Override
    public void realmSet$priceTotal(Float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.priceTotalIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setFloat(columnInfo.priceTotalIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.priceTotalIndex);
            return;
        }
        proxyState.getRow$realm().setFloat(columnInfo.priceTotalIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Float realmGet$priceTotalWithTax() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.priceTotalWithTaxIndex)) {
            return null;
        }
        return (float) proxyState.getRow$realm().getFloat(columnInfo.priceTotalWithTaxIndex);
    }

    @Override
    public void realmSet$priceTotalWithTax(Float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.priceTotalWithTaxIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setFloat(columnInfo.priceTotalWithTaxIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.priceTotalWithTaxIndex);
            return;
        }
        proxyState.getRow$realm().setFloat(columnInfo.priceTotalWithTaxIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Float realmGet$taxAmount() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.taxAmountIndex)) {
            return null;
        }
        return (float) proxyState.getRow$realm().getFloat(columnInfo.taxAmountIndex);
    }

    @Override
    public void realmSet$taxAmount(Float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.taxAmountIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setFloat(columnInfo.taxAmountIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.taxAmountIndex);
            return;
        }
        proxyState.getRow$realm().setFloat(columnInfo.taxAmountIndex, value);
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
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.userIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.userIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$createdAt() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.createdAtIndex)) {
            return null;
        }
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.createdAtIndex);
    }

    @Override
    public void realmSet$createdAt(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.createdAtIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDate(columnInfo.createdAtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.createdAtIndex);
            return;
        }
        proxyState.getRow$realm().setDate(columnInfo.createdAtIndex, value);
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
    public String realmGet$memberCode() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.memberCodeIndex);
    }

    @Override
    public void realmSet$memberCode(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.memberCodeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.memberCodeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.memberCodeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.memberCodeIndex, value);
    }

    @Override
    public RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem> realmGet$orderItems() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (orderItemsRealmList != null) {
            return orderItemsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.orderItemsIndex);
            orderItemsRealmList = new RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem>(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class, osList, proxyState.getRealm$realm());
            return orderItemsRealmList;
        }
    }

    @Override
    public void realmSet$orderItems(RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("orderItems")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem> original = value;
                value = new RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem>();
                for (com.rhinoactive.foreorder_golf_employee.models.OrderItem item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.orderItemsIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.rhinoactive.foreorder_golf_employee.models.OrderItem linkedObject = value.get(i);
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
                com.rhinoactive.foreorder_golf_employee.models.OrderItem linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Order", 17, 0);
        builder.addPersistedProperty("orderId", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("user", RealmFieldType.OBJECT, "User");
        builder.addPersistedProperty("currentState", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("orderNum", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("clubId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("menuId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("delivery", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("fulfilled", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("priceTotal", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("priceTotalWithTax", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("taxAmount", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("quantity", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("userId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("createdAt", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("modifiedAt", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("memberCode", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("orderItems", RealmFieldType.LIST, "OrderItem");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static OrderColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new OrderColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Order";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.rhinoactive.foreorder_golf_employee.models.Order createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        com.rhinoactive.foreorder_golf_employee.models.Order obj = null;
        if (update) {
            Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.Order.class);
            OrderColumnInfo columnInfo = (OrderColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.Order.class);
            long pkColumnIndex = columnInfo.orderIdIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("orderId")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("orderId"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.Order.class), false, Collections.<String> emptyList());
                    obj = new io.realm.OrderRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("user")) {
                excludeFields.add("user");
            }
            if (json.has("orderItems")) {
                excludeFields.add("orderItems");
            }
            if (json.has("orderId")) {
                if (json.isNull("orderId")) {
                    obj = (io.realm.OrderRealmProxy) realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.Order.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.OrderRealmProxy) realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.Order.class, json.getInt("orderId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'orderId'.");
            }
        }

        final OrderRealmProxyInterface objProxy = (OrderRealmProxyInterface) obj;
        if (json.has("user")) {
            if (json.isNull("user")) {
                objProxy.realmSet$user(null);
            } else {
                com.rhinoactive.foreorder_golf_employee.models.User userObj = UserRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("user"), update);
                objProxy.realmSet$user(userObj);
            }
        }
        if (json.has("currentState")) {
            if (json.isNull("currentState")) {
                objProxy.realmSet$currentState(null);
            } else {
                objProxy.realmSet$currentState((String) json.getString("currentState"));
            }
        }
        if (json.has("orderNum")) {
            if (json.isNull("orderNum")) {
                objProxy.realmSet$orderNum(null);
            } else {
                objProxy.realmSet$orderNum((int) json.getInt("orderNum"));
            }
        }
        if (json.has("clubId")) {
            if (json.isNull("clubId")) {
                objProxy.realmSet$clubId(null);
            } else {
                objProxy.realmSet$clubId((int) json.getInt("clubId"));
            }
        }
        if (json.has("menuId")) {
            if (json.isNull("menuId")) {
                objProxy.realmSet$menuId(null);
            } else {
                objProxy.realmSet$menuId((int) json.getInt("menuId"));
            }
        }
        if (json.has("delivery")) {
            if (json.isNull("delivery")) {
                objProxy.realmSet$delivery(null);
            } else {
                objProxy.realmSet$delivery((boolean) json.getBoolean("delivery"));
            }
        }
        if (json.has("fulfilled")) {
            if (json.isNull("fulfilled")) {
                objProxy.realmSet$fulfilled(null);
            } else {
                objProxy.realmSet$fulfilled((boolean) json.getBoolean("fulfilled"));
            }
        }
        if (json.has("priceTotal")) {
            if (json.isNull("priceTotal")) {
                objProxy.realmSet$priceTotal(null);
            } else {
                objProxy.realmSet$priceTotal((float) json.getDouble("priceTotal"));
            }
        }
        if (json.has("priceTotalWithTax")) {
            if (json.isNull("priceTotalWithTax")) {
                objProxy.realmSet$priceTotalWithTax(null);
            } else {
                objProxy.realmSet$priceTotalWithTax((float) json.getDouble("priceTotalWithTax"));
            }
        }
        if (json.has("taxAmount")) {
            if (json.isNull("taxAmount")) {
                objProxy.realmSet$taxAmount(null);
            } else {
                objProxy.realmSet$taxAmount((float) json.getDouble("taxAmount"));
            }
        }
        if (json.has("quantity")) {
            if (json.isNull("quantity")) {
                objProxy.realmSet$quantity(null);
            } else {
                objProxy.realmSet$quantity((int) json.getInt("quantity"));
            }
        }
        if (json.has("userId")) {
            if (json.isNull("userId")) {
                objProxy.realmSet$userId(null);
            } else {
                objProxy.realmSet$userId((int) json.getInt("userId"));
            }
        }
        if (json.has("createdAt")) {
            if (json.isNull("createdAt")) {
                objProxy.realmSet$createdAt(null);
            } else {
                Object timestamp = json.get("createdAt");
                if (timestamp instanceof String) {
                    objProxy.realmSet$createdAt(JsonUtils.stringToDate((String) timestamp));
                } else {
                    objProxy.realmSet$createdAt(new Date(json.getLong("createdAt")));
                }
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
        if (json.has("memberCode")) {
            if (json.isNull("memberCode")) {
                objProxy.realmSet$memberCode(null);
            } else {
                objProxy.realmSet$memberCode((String) json.getString("memberCode"));
            }
        }
        if (json.has("orderItems")) {
            if (json.isNull("orderItems")) {
                objProxy.realmSet$orderItems(null);
            } else {
                objProxy.realmGet$orderItems().clear();
                JSONArray array = json.getJSONArray("orderItems");
                for (int i = 0; i < array.length(); i++) {
                    com.rhinoactive.foreorder_golf_employee.models.OrderItem item = OrderItemRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$orderItems().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.rhinoactive.foreorder_golf_employee.models.Order createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.rhinoactive.foreorder_golf_employee.models.Order obj = new com.rhinoactive.foreorder_golf_employee.models.Order();
        final OrderRealmProxyInterface objProxy = (OrderRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("orderId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$orderId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$orderId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("user")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$user(null);
                } else {
                    com.rhinoactive.foreorder_golf_employee.models.User userObj = UserRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$user(userObj);
                }
            } else if (name.equals("currentState")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$currentState((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$currentState(null);
                }
            } else if (name.equals("orderNum")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$orderNum((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$orderNum(null);
                }
            } else if (name.equals("clubId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$clubId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$clubId(null);
                }
            } else if (name.equals("menuId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$menuId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$menuId(null);
                }
            } else if (name.equals("delivery")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$delivery((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$delivery(null);
                }
            } else if (name.equals("fulfilled")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fulfilled((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fulfilled(null);
                }
            } else if (name.equals("priceTotal")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$priceTotal((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$priceTotal(null);
                }
            } else if (name.equals("priceTotalWithTax")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$priceTotalWithTax((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$priceTotalWithTax(null);
                }
            } else if (name.equals("taxAmount")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$taxAmount((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$taxAmount(null);
                }
            } else if (name.equals("quantity")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$quantity((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$quantity(null);
                }
            } else if (name.equals("userId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userId(null);
                }
            } else if (name.equals("createdAt")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$createdAt(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        objProxy.realmSet$createdAt(new Date(timestamp));
                    }
                } else {
                    objProxy.realmSet$createdAt(JsonUtils.stringToDate(reader.nextString()));
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
            } else if (name.equals("memberCode")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$memberCode((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$memberCode(null);
                }
            } else if (name.equals("orderItems")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$orderItems(null);
                } else {
                    objProxy.realmSet$orderItems(new RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.rhinoactive.foreorder_golf_employee.models.OrderItem item = OrderItemRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$orderItems().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'orderId'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.rhinoactive.foreorder_golf_employee.models.Order copyOrUpdate(Realm realm, com.rhinoactive.foreorder_golf_employee.models.Order object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.rhinoactive.foreorder_golf_employee.models.Order) cachedRealmObject;
        }

        com.rhinoactive.foreorder_golf_employee.models.Order realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.Order.class);
            OrderColumnInfo columnInfo = (OrderColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.Order.class);
            long pkColumnIndex = columnInfo.orderIdIndex;
            Number value = ((OrderRealmProxyInterface) object).realmGet$orderId();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.Order.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.OrderRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.rhinoactive.foreorder_golf_employee.models.Order copy(Realm realm, com.rhinoactive.foreorder_golf_employee.models.Order newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.rhinoactive.foreorder_golf_employee.models.Order) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.rhinoactive.foreorder_golf_employee.models.Order realmObject = realm.createObjectInternal(com.rhinoactive.foreorder_golf_employee.models.Order.class, ((OrderRealmProxyInterface) newObject).realmGet$orderId(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        OrderRealmProxyInterface realmObjectSource = (OrderRealmProxyInterface) newObject;
        OrderRealmProxyInterface realmObjectCopy = (OrderRealmProxyInterface) realmObject;


        com.rhinoactive.foreorder_golf_employee.models.User userObj = realmObjectSource.realmGet$user();
        if (userObj == null) {
            realmObjectCopy.realmSet$user(null);
        } else {
            com.rhinoactive.foreorder_golf_employee.models.User cacheuser = (com.rhinoactive.foreorder_golf_employee.models.User) cache.get(userObj);
            if (cacheuser != null) {
                realmObjectCopy.realmSet$user(cacheuser);
            } else {
                realmObjectCopy.realmSet$user(UserRealmProxy.copyOrUpdate(realm, userObj, update, cache));
            }
        }
        realmObjectCopy.realmSet$currentState(realmObjectSource.realmGet$currentState());
        realmObjectCopy.realmSet$orderNum(realmObjectSource.realmGet$orderNum());
        realmObjectCopy.realmSet$clubId(realmObjectSource.realmGet$clubId());
        realmObjectCopy.realmSet$menuId(realmObjectSource.realmGet$menuId());
        realmObjectCopy.realmSet$delivery(realmObjectSource.realmGet$delivery());
        realmObjectCopy.realmSet$fulfilled(realmObjectSource.realmGet$fulfilled());
        realmObjectCopy.realmSet$priceTotal(realmObjectSource.realmGet$priceTotal());
        realmObjectCopy.realmSet$priceTotalWithTax(realmObjectSource.realmGet$priceTotalWithTax());
        realmObjectCopy.realmSet$taxAmount(realmObjectSource.realmGet$taxAmount());
        realmObjectCopy.realmSet$quantity(realmObjectSource.realmGet$quantity());
        realmObjectCopy.realmSet$userId(realmObjectSource.realmGet$userId());
        realmObjectCopy.realmSet$createdAt(realmObjectSource.realmGet$createdAt());
        realmObjectCopy.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        realmObjectCopy.realmSet$memberCode(realmObjectSource.realmGet$memberCode());

        RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem> orderItemsList = realmObjectSource.realmGet$orderItems();
        if (orderItemsList != null) {
            RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem> orderItemsRealmList = realmObjectCopy.realmGet$orderItems();
            orderItemsRealmList.clear();
            for (int i = 0; i < orderItemsList.size(); i++) {
                com.rhinoactive.foreorder_golf_employee.models.OrderItem orderItemsItem = orderItemsList.get(i);
                com.rhinoactive.foreorder_golf_employee.models.OrderItem cacheorderItems = (com.rhinoactive.foreorder_golf_employee.models.OrderItem) cache.get(orderItemsItem);
                if (cacheorderItems != null) {
                    orderItemsRealmList.add(cacheorderItems);
                } else {
                    orderItemsRealmList.add(OrderItemRealmProxy.copyOrUpdate(realm, orderItemsItem, update, cache));
                }
            }
        }

        return realmObject;
    }

    public static long insert(Realm realm, com.rhinoactive.foreorder_golf_employee.models.Order object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.Order.class);
        long tableNativePtr = table.getNativePtr();
        OrderColumnInfo columnInfo = (OrderColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.Order.class);
        long pkColumnIndex = columnInfo.orderIdIndex;
        Object primaryKeyValue = ((OrderRealmProxyInterface) object).realmGet$orderId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((OrderRealmProxyInterface) object).realmGet$orderId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((OrderRealmProxyInterface) object).realmGet$orderId());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);

        com.rhinoactive.foreorder_golf_employee.models.User userObj = ((OrderRealmProxyInterface) object).realmGet$user();
        if (userObj != null) {
            Long cacheuser = cache.get(userObj);
            if (cacheuser == null) {
                cacheuser = UserRealmProxy.insert(realm, userObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.userIndex, rowIndex, cacheuser, false);
        }
        String realmGet$currentState = ((OrderRealmProxyInterface) object).realmGet$currentState();
        if (realmGet$currentState != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.currentStateIndex, rowIndex, realmGet$currentState, false);
        }
        Number realmGet$orderNum = ((OrderRealmProxyInterface) object).realmGet$orderNum();
        if (realmGet$orderNum != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.orderNumIndex, rowIndex, realmGet$orderNum.longValue(), false);
        }
        Number realmGet$clubId = ((OrderRealmProxyInterface) object).realmGet$clubId();
        if (realmGet$clubId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.clubIdIndex, rowIndex, realmGet$clubId.longValue(), false);
        }
        Number realmGet$menuId = ((OrderRealmProxyInterface) object).realmGet$menuId();
        if (realmGet$menuId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.menuIdIndex, rowIndex, realmGet$menuId.longValue(), false);
        }
        Boolean realmGet$delivery = ((OrderRealmProxyInterface) object).realmGet$delivery();
        if (realmGet$delivery != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.deliveryIndex, rowIndex, realmGet$delivery, false);
        }
        Boolean realmGet$fulfilled = ((OrderRealmProxyInterface) object).realmGet$fulfilled();
        if (realmGet$fulfilled != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.fulfilledIndex, rowIndex, realmGet$fulfilled, false);
        }
        Float realmGet$priceTotal = ((OrderRealmProxyInterface) object).realmGet$priceTotal();
        if (realmGet$priceTotal != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.priceTotalIndex, rowIndex, realmGet$priceTotal, false);
        }
        Float realmGet$priceTotalWithTax = ((OrderRealmProxyInterface) object).realmGet$priceTotalWithTax();
        if (realmGet$priceTotalWithTax != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.priceTotalWithTaxIndex, rowIndex, realmGet$priceTotalWithTax, false);
        }
        Float realmGet$taxAmount = ((OrderRealmProxyInterface) object).realmGet$taxAmount();
        if (realmGet$taxAmount != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.taxAmountIndex, rowIndex, realmGet$taxAmount, false);
        }
        Number realmGet$quantity = ((OrderRealmProxyInterface) object).realmGet$quantity();
        if (realmGet$quantity != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.quantityIndex, rowIndex, realmGet$quantity.longValue(), false);
        }
        Number realmGet$userId = ((OrderRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId.longValue(), false);
        }
        java.util.Date realmGet$createdAt = ((OrderRealmProxyInterface) object).realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.createdAtIndex, rowIndex, realmGet$createdAt.getTime(), false);
        }
        java.util.Date realmGet$modifiedAt = ((OrderRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        }
        String realmGet$memberCode = ((OrderRealmProxyInterface) object).realmGet$memberCode();
        if (realmGet$memberCode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.memberCodeIndex, rowIndex, realmGet$memberCode, false);
        }

        RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem> orderItemsList = ((OrderRealmProxyInterface) object).realmGet$orderItems();
        if (orderItemsList != null) {
            OsList orderItemsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.orderItemsIndex);
            for (com.rhinoactive.foreorder_golf_employee.models.OrderItem orderItemsItem : orderItemsList) {
                Long cacheItemIndexorderItems = cache.get(orderItemsItem);
                if (cacheItemIndexorderItems == null) {
                    cacheItemIndexorderItems = OrderItemRealmProxy.insert(realm, orderItemsItem, cache);
                }
                orderItemsOsList.addRow(cacheItemIndexorderItems);
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.Order.class);
        long tableNativePtr = table.getNativePtr();
        OrderColumnInfo columnInfo = (OrderColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.Order.class);
        long pkColumnIndex = columnInfo.orderIdIndex;
        com.rhinoactive.foreorder_golf_employee.models.Order object = null;
        while (objects.hasNext()) {
            object = (com.rhinoactive.foreorder_golf_employee.models.Order) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((OrderRealmProxyInterface) object).realmGet$orderId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((OrderRealmProxyInterface) object).realmGet$orderId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((OrderRealmProxyInterface) object).realmGet$orderId());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);

            com.rhinoactive.foreorder_golf_employee.models.User userObj = ((OrderRealmProxyInterface) object).realmGet$user();
            if (userObj != null) {
                Long cacheuser = cache.get(userObj);
                if (cacheuser == null) {
                    cacheuser = UserRealmProxy.insert(realm, userObj, cache);
                }
                table.setLink(columnInfo.userIndex, rowIndex, cacheuser, false);
            }
            String realmGet$currentState = ((OrderRealmProxyInterface) object).realmGet$currentState();
            if (realmGet$currentState != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.currentStateIndex, rowIndex, realmGet$currentState, false);
            }
            Number realmGet$orderNum = ((OrderRealmProxyInterface) object).realmGet$orderNum();
            if (realmGet$orderNum != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.orderNumIndex, rowIndex, realmGet$orderNum.longValue(), false);
            }
            Number realmGet$clubId = ((OrderRealmProxyInterface) object).realmGet$clubId();
            if (realmGet$clubId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.clubIdIndex, rowIndex, realmGet$clubId.longValue(), false);
            }
            Number realmGet$menuId = ((OrderRealmProxyInterface) object).realmGet$menuId();
            if (realmGet$menuId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.menuIdIndex, rowIndex, realmGet$menuId.longValue(), false);
            }
            Boolean realmGet$delivery = ((OrderRealmProxyInterface) object).realmGet$delivery();
            if (realmGet$delivery != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.deliveryIndex, rowIndex, realmGet$delivery, false);
            }
            Boolean realmGet$fulfilled = ((OrderRealmProxyInterface) object).realmGet$fulfilled();
            if (realmGet$fulfilled != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.fulfilledIndex, rowIndex, realmGet$fulfilled, false);
            }
            Float realmGet$priceTotal = ((OrderRealmProxyInterface) object).realmGet$priceTotal();
            if (realmGet$priceTotal != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.priceTotalIndex, rowIndex, realmGet$priceTotal, false);
            }
            Float realmGet$priceTotalWithTax = ((OrderRealmProxyInterface) object).realmGet$priceTotalWithTax();
            if (realmGet$priceTotalWithTax != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.priceTotalWithTaxIndex, rowIndex, realmGet$priceTotalWithTax, false);
            }
            Float realmGet$taxAmount = ((OrderRealmProxyInterface) object).realmGet$taxAmount();
            if (realmGet$taxAmount != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.taxAmountIndex, rowIndex, realmGet$taxAmount, false);
            }
            Number realmGet$quantity = ((OrderRealmProxyInterface) object).realmGet$quantity();
            if (realmGet$quantity != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.quantityIndex, rowIndex, realmGet$quantity.longValue(), false);
            }
            Number realmGet$userId = ((OrderRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId.longValue(), false);
            }
            java.util.Date realmGet$createdAt = ((OrderRealmProxyInterface) object).realmGet$createdAt();
            if (realmGet$createdAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.createdAtIndex, rowIndex, realmGet$createdAt.getTime(), false);
            }
            java.util.Date realmGet$modifiedAt = ((OrderRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            }
            String realmGet$memberCode = ((OrderRealmProxyInterface) object).realmGet$memberCode();
            if (realmGet$memberCode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.memberCodeIndex, rowIndex, realmGet$memberCode, false);
            }

            RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem> orderItemsList = ((OrderRealmProxyInterface) object).realmGet$orderItems();
            if (orderItemsList != null) {
                OsList orderItemsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.orderItemsIndex);
                for (com.rhinoactive.foreorder_golf_employee.models.OrderItem orderItemsItem : orderItemsList) {
                    Long cacheItemIndexorderItems = cache.get(orderItemsItem);
                    if (cacheItemIndexorderItems == null) {
                        cacheItemIndexorderItems = OrderItemRealmProxy.insert(realm, orderItemsItem, cache);
                    }
                    orderItemsOsList.addRow(cacheItemIndexorderItems);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.rhinoactive.foreorder_golf_employee.models.Order object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.Order.class);
        long tableNativePtr = table.getNativePtr();
        OrderColumnInfo columnInfo = (OrderColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.Order.class);
        long pkColumnIndex = columnInfo.orderIdIndex;
        Object primaryKeyValue = ((OrderRealmProxyInterface) object).realmGet$orderId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((OrderRealmProxyInterface) object).realmGet$orderId());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((OrderRealmProxyInterface) object).realmGet$orderId());
        }
        cache.put(object, rowIndex);

        com.rhinoactive.foreorder_golf_employee.models.User userObj = ((OrderRealmProxyInterface) object).realmGet$user();
        if (userObj != null) {
            Long cacheuser = cache.get(userObj);
            if (cacheuser == null) {
                cacheuser = UserRealmProxy.insertOrUpdate(realm, userObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.userIndex, rowIndex, cacheuser, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.userIndex, rowIndex);
        }
        String realmGet$currentState = ((OrderRealmProxyInterface) object).realmGet$currentState();
        if (realmGet$currentState != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.currentStateIndex, rowIndex, realmGet$currentState, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.currentStateIndex, rowIndex, false);
        }
        Number realmGet$orderNum = ((OrderRealmProxyInterface) object).realmGet$orderNum();
        if (realmGet$orderNum != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.orderNumIndex, rowIndex, realmGet$orderNum.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.orderNumIndex, rowIndex, false);
        }
        Number realmGet$clubId = ((OrderRealmProxyInterface) object).realmGet$clubId();
        if (realmGet$clubId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.clubIdIndex, rowIndex, realmGet$clubId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.clubIdIndex, rowIndex, false);
        }
        Number realmGet$menuId = ((OrderRealmProxyInterface) object).realmGet$menuId();
        if (realmGet$menuId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.menuIdIndex, rowIndex, realmGet$menuId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.menuIdIndex, rowIndex, false);
        }
        Boolean realmGet$delivery = ((OrderRealmProxyInterface) object).realmGet$delivery();
        if (realmGet$delivery != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.deliveryIndex, rowIndex, realmGet$delivery, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deliveryIndex, rowIndex, false);
        }
        Boolean realmGet$fulfilled = ((OrderRealmProxyInterface) object).realmGet$fulfilled();
        if (realmGet$fulfilled != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.fulfilledIndex, rowIndex, realmGet$fulfilled, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fulfilledIndex, rowIndex, false);
        }
        Float realmGet$priceTotal = ((OrderRealmProxyInterface) object).realmGet$priceTotal();
        if (realmGet$priceTotal != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.priceTotalIndex, rowIndex, realmGet$priceTotal, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.priceTotalIndex, rowIndex, false);
        }
        Float realmGet$priceTotalWithTax = ((OrderRealmProxyInterface) object).realmGet$priceTotalWithTax();
        if (realmGet$priceTotalWithTax != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.priceTotalWithTaxIndex, rowIndex, realmGet$priceTotalWithTax, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.priceTotalWithTaxIndex, rowIndex, false);
        }
        Float realmGet$taxAmount = ((OrderRealmProxyInterface) object).realmGet$taxAmount();
        if (realmGet$taxAmount != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.taxAmountIndex, rowIndex, realmGet$taxAmount, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.taxAmountIndex, rowIndex, false);
        }
        Number realmGet$quantity = ((OrderRealmProxyInterface) object).realmGet$quantity();
        if (realmGet$quantity != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.quantityIndex, rowIndex, realmGet$quantity.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.quantityIndex, rowIndex, false);
        }
        Number realmGet$userId = ((OrderRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
        }
        java.util.Date realmGet$createdAt = ((OrderRealmProxyInterface) object).realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.createdAtIndex, rowIndex, realmGet$createdAt.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.createdAtIndex, rowIndex, false);
        }
        java.util.Date realmGet$modifiedAt = ((OrderRealmProxyInterface) object).realmGet$modifiedAt();
        if (realmGet$modifiedAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
        }
        String realmGet$memberCode = ((OrderRealmProxyInterface) object).realmGet$memberCode();
        if (realmGet$memberCode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.memberCodeIndex, rowIndex, realmGet$memberCode, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.memberCodeIndex, rowIndex, false);
        }

        OsList orderItemsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.orderItemsIndex);
        RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem> orderItemsList = ((OrderRealmProxyInterface) object).realmGet$orderItems();
        if (orderItemsList != null && orderItemsList.size() == orderItemsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = orderItemsList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinoactive.foreorder_golf_employee.models.OrderItem orderItemsItem = orderItemsList.get(i);
                Long cacheItemIndexorderItems = cache.get(orderItemsItem);
                if (cacheItemIndexorderItems == null) {
                    cacheItemIndexorderItems = OrderItemRealmProxy.insertOrUpdate(realm, orderItemsItem, cache);
                }
                orderItemsOsList.setRow(i, cacheItemIndexorderItems);
            }
        } else {
            orderItemsOsList.removeAll();
            if (orderItemsList != null) {
                for (com.rhinoactive.foreorder_golf_employee.models.OrderItem orderItemsItem : orderItemsList) {
                    Long cacheItemIndexorderItems = cache.get(orderItemsItem);
                    if (cacheItemIndexorderItems == null) {
                        cacheItemIndexorderItems = OrderItemRealmProxy.insertOrUpdate(realm, orderItemsItem, cache);
                    }
                    orderItemsOsList.addRow(cacheItemIndexorderItems);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.rhinoactive.foreorder_golf_employee.models.Order.class);
        long tableNativePtr = table.getNativePtr();
        OrderColumnInfo columnInfo = (OrderColumnInfo) realm.getSchema().getColumnInfo(com.rhinoactive.foreorder_golf_employee.models.Order.class);
        long pkColumnIndex = columnInfo.orderIdIndex;
        com.rhinoactive.foreorder_golf_employee.models.Order object = null;
        while (objects.hasNext()) {
            object = (com.rhinoactive.foreorder_golf_employee.models.Order) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((OrderRealmProxyInterface) object).realmGet$orderId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((OrderRealmProxyInterface) object).realmGet$orderId());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((OrderRealmProxyInterface) object).realmGet$orderId());
            }
            cache.put(object, rowIndex);

            com.rhinoactive.foreorder_golf_employee.models.User userObj = ((OrderRealmProxyInterface) object).realmGet$user();
            if (userObj != null) {
                Long cacheuser = cache.get(userObj);
                if (cacheuser == null) {
                    cacheuser = UserRealmProxy.insertOrUpdate(realm, userObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.userIndex, rowIndex, cacheuser, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.userIndex, rowIndex);
            }
            String realmGet$currentState = ((OrderRealmProxyInterface) object).realmGet$currentState();
            if (realmGet$currentState != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.currentStateIndex, rowIndex, realmGet$currentState, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.currentStateIndex, rowIndex, false);
            }
            Number realmGet$orderNum = ((OrderRealmProxyInterface) object).realmGet$orderNum();
            if (realmGet$orderNum != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.orderNumIndex, rowIndex, realmGet$orderNum.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.orderNumIndex, rowIndex, false);
            }
            Number realmGet$clubId = ((OrderRealmProxyInterface) object).realmGet$clubId();
            if (realmGet$clubId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.clubIdIndex, rowIndex, realmGet$clubId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.clubIdIndex, rowIndex, false);
            }
            Number realmGet$menuId = ((OrderRealmProxyInterface) object).realmGet$menuId();
            if (realmGet$menuId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.menuIdIndex, rowIndex, realmGet$menuId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.menuIdIndex, rowIndex, false);
            }
            Boolean realmGet$delivery = ((OrderRealmProxyInterface) object).realmGet$delivery();
            if (realmGet$delivery != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.deliveryIndex, rowIndex, realmGet$delivery, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deliveryIndex, rowIndex, false);
            }
            Boolean realmGet$fulfilled = ((OrderRealmProxyInterface) object).realmGet$fulfilled();
            if (realmGet$fulfilled != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.fulfilledIndex, rowIndex, realmGet$fulfilled, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fulfilledIndex, rowIndex, false);
            }
            Float realmGet$priceTotal = ((OrderRealmProxyInterface) object).realmGet$priceTotal();
            if (realmGet$priceTotal != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.priceTotalIndex, rowIndex, realmGet$priceTotal, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.priceTotalIndex, rowIndex, false);
            }
            Float realmGet$priceTotalWithTax = ((OrderRealmProxyInterface) object).realmGet$priceTotalWithTax();
            if (realmGet$priceTotalWithTax != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.priceTotalWithTaxIndex, rowIndex, realmGet$priceTotalWithTax, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.priceTotalWithTaxIndex, rowIndex, false);
            }
            Float realmGet$taxAmount = ((OrderRealmProxyInterface) object).realmGet$taxAmount();
            if (realmGet$taxAmount != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.taxAmountIndex, rowIndex, realmGet$taxAmount, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.taxAmountIndex, rowIndex, false);
            }
            Number realmGet$quantity = ((OrderRealmProxyInterface) object).realmGet$quantity();
            if (realmGet$quantity != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.quantityIndex, rowIndex, realmGet$quantity.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.quantityIndex, rowIndex, false);
            }
            Number realmGet$userId = ((OrderRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
            }
            java.util.Date realmGet$createdAt = ((OrderRealmProxyInterface) object).realmGet$createdAt();
            if (realmGet$createdAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.createdAtIndex, rowIndex, realmGet$createdAt.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.createdAtIndex, rowIndex, false);
            }
            java.util.Date realmGet$modifiedAt = ((OrderRealmProxyInterface) object).realmGet$modifiedAt();
            if (realmGet$modifiedAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, realmGet$modifiedAt.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.modifiedAtIndex, rowIndex, false);
            }
            String realmGet$memberCode = ((OrderRealmProxyInterface) object).realmGet$memberCode();
            if (realmGet$memberCode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.memberCodeIndex, rowIndex, realmGet$memberCode, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.memberCodeIndex, rowIndex, false);
            }

            OsList orderItemsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.orderItemsIndex);
            RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem> orderItemsList = ((OrderRealmProxyInterface) object).realmGet$orderItems();
            if (orderItemsList != null && orderItemsList.size() == orderItemsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = orderItemsList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.rhinoactive.foreorder_golf_employee.models.OrderItem orderItemsItem = orderItemsList.get(i);
                    Long cacheItemIndexorderItems = cache.get(orderItemsItem);
                    if (cacheItemIndexorderItems == null) {
                        cacheItemIndexorderItems = OrderItemRealmProxy.insertOrUpdate(realm, orderItemsItem, cache);
                    }
                    orderItemsOsList.setRow(i, cacheItemIndexorderItems);
                }
            } else {
                orderItemsOsList.removeAll();
                if (orderItemsList != null) {
                    for (com.rhinoactive.foreorder_golf_employee.models.OrderItem orderItemsItem : orderItemsList) {
                        Long cacheItemIndexorderItems = cache.get(orderItemsItem);
                        if (cacheItemIndexorderItems == null) {
                            cacheItemIndexorderItems = OrderItemRealmProxy.insertOrUpdate(realm, orderItemsItem, cache);
                        }
                        orderItemsOsList.addRow(cacheItemIndexorderItems);
                    }
                }
            }

        }
    }

    public static com.rhinoactive.foreorder_golf_employee.models.Order createDetachedCopy(com.rhinoactive.foreorder_golf_employee.models.Order realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.rhinoactive.foreorder_golf_employee.models.Order unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.rhinoactive.foreorder_golf_employee.models.Order();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.rhinoactive.foreorder_golf_employee.models.Order) cachedObject.object;
            }
            unmanagedObject = (com.rhinoactive.foreorder_golf_employee.models.Order) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        OrderRealmProxyInterface unmanagedCopy = (OrderRealmProxyInterface) unmanagedObject;
        OrderRealmProxyInterface realmSource = (OrderRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$orderId(realmSource.realmGet$orderId());

        // Deep copy of user
        unmanagedCopy.realmSet$user(UserRealmProxy.createDetachedCopy(realmSource.realmGet$user(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$currentState(realmSource.realmGet$currentState());
        unmanagedCopy.realmSet$orderNum(realmSource.realmGet$orderNum());
        unmanagedCopy.realmSet$clubId(realmSource.realmGet$clubId());
        unmanagedCopy.realmSet$menuId(realmSource.realmGet$menuId());
        unmanagedCopy.realmSet$delivery(realmSource.realmGet$delivery());
        unmanagedCopy.realmSet$fulfilled(realmSource.realmGet$fulfilled());
        unmanagedCopy.realmSet$priceTotal(realmSource.realmGet$priceTotal());
        unmanagedCopy.realmSet$priceTotalWithTax(realmSource.realmGet$priceTotalWithTax());
        unmanagedCopy.realmSet$taxAmount(realmSource.realmGet$taxAmount());
        unmanagedCopy.realmSet$quantity(realmSource.realmGet$quantity());
        unmanagedCopy.realmSet$userId(realmSource.realmGet$userId());
        unmanagedCopy.realmSet$createdAt(realmSource.realmGet$createdAt());
        unmanagedCopy.realmSet$modifiedAt(realmSource.realmGet$modifiedAt());
        unmanagedCopy.realmSet$memberCode(realmSource.realmGet$memberCode());

        // Deep copy of orderItems
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$orderItems(null);
        } else {
            RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem> managedorderItemsList = realmSource.realmGet$orderItems();
            RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem> unmanagedorderItemsList = new RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem>();
            unmanagedCopy.realmSet$orderItems(unmanagedorderItemsList);
            int nextDepth = currentDepth + 1;
            int size = managedorderItemsList.size();
            for (int i = 0; i < size; i++) {
                com.rhinoactive.foreorder_golf_employee.models.OrderItem item = OrderItemRealmProxy.createDetachedCopy(managedorderItemsList.get(i), nextDepth, maxDepth, cache);
                unmanagedorderItemsList.add(item);
            }
        }

        return unmanagedObject;
    }

    static com.rhinoactive.foreorder_golf_employee.models.Order update(Realm realm, com.rhinoactive.foreorder_golf_employee.models.Order realmObject, com.rhinoactive.foreorder_golf_employee.models.Order newObject, Map<RealmModel, RealmObjectProxy> cache) {
        OrderRealmProxyInterface realmObjectTarget = (OrderRealmProxyInterface) realmObject;
        OrderRealmProxyInterface realmObjectSource = (OrderRealmProxyInterface) newObject;
        com.rhinoactive.foreorder_golf_employee.models.User userObj = realmObjectSource.realmGet$user();
        if (userObj == null) {
            realmObjectTarget.realmSet$user(null);
        } else {
            com.rhinoactive.foreorder_golf_employee.models.User cacheuser = (com.rhinoactive.foreorder_golf_employee.models.User) cache.get(userObj);
            if (cacheuser != null) {
                realmObjectTarget.realmSet$user(cacheuser);
            } else {
                realmObjectTarget.realmSet$user(UserRealmProxy.copyOrUpdate(realm, userObj, true, cache));
            }
        }
        realmObjectTarget.realmSet$currentState(realmObjectSource.realmGet$currentState());
        realmObjectTarget.realmSet$orderNum(realmObjectSource.realmGet$orderNum());
        realmObjectTarget.realmSet$clubId(realmObjectSource.realmGet$clubId());
        realmObjectTarget.realmSet$menuId(realmObjectSource.realmGet$menuId());
        realmObjectTarget.realmSet$delivery(realmObjectSource.realmGet$delivery());
        realmObjectTarget.realmSet$fulfilled(realmObjectSource.realmGet$fulfilled());
        realmObjectTarget.realmSet$priceTotal(realmObjectSource.realmGet$priceTotal());
        realmObjectTarget.realmSet$priceTotalWithTax(realmObjectSource.realmGet$priceTotalWithTax());
        realmObjectTarget.realmSet$taxAmount(realmObjectSource.realmGet$taxAmount());
        realmObjectTarget.realmSet$quantity(realmObjectSource.realmGet$quantity());
        realmObjectTarget.realmSet$userId(realmObjectSource.realmGet$userId());
        realmObjectTarget.realmSet$createdAt(realmObjectSource.realmGet$createdAt());
        realmObjectTarget.realmSet$modifiedAt(realmObjectSource.realmGet$modifiedAt());
        realmObjectTarget.realmSet$memberCode(realmObjectSource.realmGet$memberCode());
        RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem> orderItemsList = realmObjectSource.realmGet$orderItems();
        RealmList<com.rhinoactive.foreorder_golf_employee.models.OrderItem> orderItemsRealmList = realmObjectTarget.realmGet$orderItems();
        if (orderItemsList != null && orderItemsList.size() == orderItemsRealmList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = orderItemsList.size();
            for (int i = 0; i < objects; i++) {
                com.rhinoactive.foreorder_golf_employee.models.OrderItem orderItemsItem = orderItemsList.get(i);
                com.rhinoactive.foreorder_golf_employee.models.OrderItem cacheorderItems = (com.rhinoactive.foreorder_golf_employee.models.OrderItem) cache.get(orderItemsItem);
                if (cacheorderItems != null) {
                    orderItemsRealmList.set(i, cacheorderItems);
                } else {
                    orderItemsRealmList.set(i, OrderItemRealmProxy.copyOrUpdate(realm, orderItemsItem, true, cache));
                }
            }
        } else {
            orderItemsRealmList.clear();
            if (orderItemsList != null) {
                for (int i = 0; i < orderItemsList.size(); i++) {
                    com.rhinoactive.foreorder_golf_employee.models.OrderItem orderItemsItem = orderItemsList.get(i);
                    com.rhinoactive.foreorder_golf_employee.models.OrderItem cacheorderItems = (com.rhinoactive.foreorder_golf_employee.models.OrderItem) cache.get(orderItemsItem);
                    if (cacheorderItems != null) {
                        orderItemsRealmList.add(cacheorderItems);
                    } else {
                        orderItemsRealmList.add(OrderItemRealmProxy.copyOrUpdate(realm, orderItemsItem, true, cache));
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
        StringBuilder stringBuilder = new StringBuilder("Order = proxy[");
        stringBuilder.append("{orderId:");
        stringBuilder.append(realmGet$orderId() != null ? realmGet$orderId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{user:");
        stringBuilder.append(realmGet$user() != null ? "User" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{currentState:");
        stringBuilder.append(realmGet$currentState() != null ? realmGet$currentState() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{orderNum:");
        stringBuilder.append(realmGet$orderNum() != null ? realmGet$orderNum() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{clubId:");
        stringBuilder.append(realmGet$clubId() != null ? realmGet$clubId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{menuId:");
        stringBuilder.append(realmGet$menuId() != null ? realmGet$menuId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{delivery:");
        stringBuilder.append(realmGet$delivery() != null ? realmGet$delivery() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fulfilled:");
        stringBuilder.append(realmGet$fulfilled() != null ? realmGet$fulfilled() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{priceTotal:");
        stringBuilder.append(realmGet$priceTotal() != null ? realmGet$priceTotal() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{priceTotalWithTax:");
        stringBuilder.append(realmGet$priceTotalWithTax() != null ? realmGet$priceTotalWithTax() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{taxAmount:");
        stringBuilder.append(realmGet$taxAmount() != null ? realmGet$taxAmount() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{quantity:");
        stringBuilder.append(realmGet$quantity() != null ? realmGet$quantity() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userId:");
        stringBuilder.append(realmGet$userId() != null ? realmGet$userId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{createdAt:");
        stringBuilder.append(realmGet$createdAt() != null ? realmGet$createdAt() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{modifiedAt:");
        stringBuilder.append(realmGet$modifiedAt() != null ? realmGet$modifiedAt() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{memberCode:");
        stringBuilder.append(realmGet$memberCode() != null ? realmGet$memberCode() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{orderItems:");
        stringBuilder.append("RealmList<OrderItem>[").append(realmGet$orderItems().size()).append("]");
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
        OrderRealmProxy aOrder = (OrderRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aOrder.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aOrder.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aOrder.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
