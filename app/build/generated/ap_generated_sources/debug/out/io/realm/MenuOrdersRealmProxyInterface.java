package io.realm;


public interface MenuOrdersRealmProxyInterface {
    public Integer realmGet$menuOrdersId();
    public void realmSet$menuOrdersId(Integer value);
    public com.rhinoactive.foreorder_golf_employee.models.Menu realmGet$menu();
    public void realmSet$menu(com.rhinoactive.foreorder_golf_employee.models.Menu value);
    public RealmList<com.rhinoactive.foreorder_golf_employee.models.Order> realmGet$orders();
    public void realmSet$orders(RealmList<com.rhinoactive.foreorder_golf_employee.models.Order> value);
}
