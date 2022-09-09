package io.realm;


import android.util.JsonReader;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(10);
        modelClasses.add(com.rhinoactive.foreorder_golf_employee.models.Club.class);
        modelClasses.add(com.rhinoactive.foreorder_golf_employee.models.ClubMenus.class);
        modelClasses.add(com.rhinoactive.foreorder_golf_employee.models.Menu.class);
        modelClasses.add(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class);
        modelClasses.add(com.rhinoactive.foreorder_golf_employee.models.Order.class);
        modelClasses.add(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class);
        modelClasses.add(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class);
        modelClasses.add(com.rhinoactive.foreorder_golf_employee.models.Session.class);
        modelClasses.add(com.rhinoactive.foreorder_golf_employee.models.User.class);
        modelClasses.add(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(10);
        infoMap.put(com.rhinoactive.foreorder_golf_employee.models.Club.class, io.realm.ClubRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinoactive.foreorder_golf_employee.models.ClubMenus.class, io.realm.ClubMenusRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinoactive.foreorder_golf_employee.models.Menu.class, io.realm.MenuRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class, io.realm.MenuOrdersRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinoactive.foreorder_golf_employee.models.Order.class, io.realm.OrderRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class, io.realm.OrderItemRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class, io.realm.OrderOptionRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinoactive.foreorder_golf_employee.models.Session.class, io.realm.SessionRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinoactive.foreorder_golf_employee.models.User.class, io.realm.UserRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class, io.realm.UserLocationRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Club.class)) {
            return io.realm.ClubRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.ClubMenus.class)) {
            return io.realm.ClubMenusRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Menu.class)) {
            return io.realm.MenuRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class)) {
            return io.realm.MenuOrdersRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Order.class)) {
            return io.realm.OrderRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class)) {
            return io.realm.OrderItemRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class)) {
            return io.realm.OrderOptionRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Session.class)) {
            return io.realm.SessionRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.User.class)) {
            return io.realm.UserRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class)) {
            return io.realm.UserLocationRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public List<String> getFieldNames(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Club.class)) {
            return io.realm.ClubRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.ClubMenus.class)) {
            return io.realm.ClubMenusRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Menu.class)) {
            return io.realm.MenuRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class)) {
            return io.realm.MenuOrdersRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Order.class)) {
            return io.realm.OrderRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class)) {
            return io.realm.OrderItemRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class)) {
            return io.realm.OrderOptionRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Session.class)) {
            return io.realm.SessionRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.User.class)) {
            return io.realm.UserRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class)) {
            return io.realm.UserLocationRealmProxy.getFieldNames();
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Club.class)) {
            return io.realm.ClubRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.ClubMenus.class)) {
            return io.realm.ClubMenusRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Menu.class)) {
            return io.realm.MenuRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class)) {
            return io.realm.MenuOrdersRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Order.class)) {
            return io.realm.OrderRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class)) {
            return io.realm.OrderItemRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class)) {
            return io.realm.OrderOptionRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Session.class)) {
            return io.realm.SessionRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.User.class)) {
            return io.realm.UserRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class)) {
            return io.realm.UserLocationRealmProxy.getSimpleClassName();
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Club.class)) {
                return clazz.cast(new io.realm.ClubRealmProxy());
            }
            if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.ClubMenus.class)) {
                return clazz.cast(new io.realm.ClubMenusRealmProxy());
            }
            if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Menu.class)) {
                return clazz.cast(new io.realm.MenuRealmProxy());
            }
            if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class)) {
                return clazz.cast(new io.realm.MenuOrdersRealmProxy());
            }
            if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Order.class)) {
                return clazz.cast(new io.realm.OrderRealmProxy());
            }
            if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class)) {
                return clazz.cast(new io.realm.OrderItemRealmProxy());
            }
            if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class)) {
                return clazz.cast(new io.realm.OrderOptionRealmProxy());
            }
            if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Session.class)) {
                return clazz.cast(new io.realm.SessionRealmProxy());
            }
            if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.User.class)) {
                return clazz.cast(new io.realm.UserRealmProxy());
            }
            if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class)) {
                return clazz.cast(new io.realm.UserLocationRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Club.class)) {
            return clazz.cast(io.realm.ClubRealmProxy.copyOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.Club) obj, update, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.ClubMenus.class)) {
            return clazz.cast(io.realm.ClubMenusRealmProxy.copyOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.ClubMenus) obj, update, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Menu.class)) {
            return clazz.cast(io.realm.MenuRealmProxy.copyOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.Menu) obj, update, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class)) {
            return clazz.cast(io.realm.MenuOrdersRealmProxy.copyOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.MenuOrders) obj, update, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Order.class)) {
            return clazz.cast(io.realm.OrderRealmProxy.copyOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.Order) obj, update, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class)) {
            return clazz.cast(io.realm.OrderItemRealmProxy.copyOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.OrderItem) obj, update, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class)) {
            return clazz.cast(io.realm.OrderOptionRealmProxy.copyOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.OrderOption) obj, update, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Session.class)) {
            return clazz.cast(io.realm.SessionRealmProxy.copyOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.Session) obj, update, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.User.class)) {
            return clazz.cast(io.realm.UserRealmProxy.copyOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.User) obj, update, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class)) {
            return clazz.cast(io.realm.UserLocationRealmProxy.copyOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.UserLocation) obj, update, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Club.class)) {
            io.realm.ClubRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.Club) object, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.ClubMenus.class)) {
            io.realm.ClubMenusRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.ClubMenus) object, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Menu.class)) {
            io.realm.MenuRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.Menu) object, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class)) {
            io.realm.MenuOrdersRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.MenuOrders) object, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Order.class)) {
            io.realm.OrderRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.Order) object, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class)) {
            io.realm.OrderItemRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.OrderItem) object, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class)) {
            io.realm.OrderOptionRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.OrderOption) object, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Session.class)) {
            io.realm.SessionRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.Session) object, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.User.class)) {
            io.realm.UserRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.User) object, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class)) {
            io.realm.UserLocationRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.UserLocation) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Club.class)) {
                io.realm.ClubRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.Club) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.ClubMenus.class)) {
                io.realm.ClubMenusRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.ClubMenus) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Menu.class)) {
                io.realm.MenuRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.Menu) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class)) {
                io.realm.MenuOrdersRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.MenuOrders) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Order.class)) {
                io.realm.OrderRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.Order) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class)) {
                io.realm.OrderItemRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.OrderItem) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class)) {
                io.realm.OrderOptionRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.OrderOption) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Session.class)) {
                io.realm.SessionRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.Session) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.User.class)) {
                io.realm.UserRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.User) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class)) {
                io.realm.UserLocationRealmProxy.insert(realm, (com.rhinoactive.foreorder_golf_employee.models.UserLocation) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Club.class)) {
                    io.realm.ClubRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.ClubMenus.class)) {
                    io.realm.ClubMenusRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Menu.class)) {
                    io.realm.MenuRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class)) {
                    io.realm.MenuOrdersRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Order.class)) {
                    io.realm.OrderRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class)) {
                    io.realm.OrderItemRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class)) {
                    io.realm.OrderOptionRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Session.class)) {
                    io.realm.SessionRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.User.class)) {
                    io.realm.UserRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class)) {
                    io.realm.UserLocationRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Club.class)) {
            io.realm.ClubRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.Club) obj, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.ClubMenus.class)) {
            io.realm.ClubMenusRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.ClubMenus) obj, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Menu.class)) {
            io.realm.MenuRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.Menu) obj, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class)) {
            io.realm.MenuOrdersRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.MenuOrders) obj, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Order.class)) {
            io.realm.OrderRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.Order) obj, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class)) {
            io.realm.OrderItemRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.OrderItem) obj, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class)) {
            io.realm.OrderOptionRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.OrderOption) obj, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Session.class)) {
            io.realm.SessionRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.Session) obj, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.User.class)) {
            io.realm.UserRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.User) obj, cache);
        } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class)) {
            io.realm.UserLocationRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.UserLocation) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Club.class)) {
                io.realm.ClubRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.Club) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.ClubMenus.class)) {
                io.realm.ClubMenusRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.ClubMenus) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Menu.class)) {
                io.realm.MenuRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.Menu) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class)) {
                io.realm.MenuOrdersRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.MenuOrders) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Order.class)) {
                io.realm.OrderRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.Order) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class)) {
                io.realm.OrderItemRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.OrderItem) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class)) {
                io.realm.OrderOptionRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.OrderOption) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Session.class)) {
                io.realm.SessionRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.Session) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.User.class)) {
                io.realm.UserRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.User) object, cache);
            } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class)) {
                io.realm.UserLocationRealmProxy.insertOrUpdate(realm, (com.rhinoactive.foreorder_golf_employee.models.UserLocation) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Club.class)) {
                    io.realm.ClubRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.ClubMenus.class)) {
                    io.realm.ClubMenusRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Menu.class)) {
                    io.realm.MenuRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class)) {
                    io.realm.MenuOrdersRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Order.class)) {
                    io.realm.OrderRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class)) {
                    io.realm.OrderItemRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class)) {
                    io.realm.OrderOptionRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Session.class)) {
                    io.realm.SessionRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.User.class)) {
                    io.realm.UserRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class)) {
                    io.realm.UserLocationRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Club.class)) {
            return clazz.cast(io.realm.ClubRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.ClubMenus.class)) {
            return clazz.cast(io.realm.ClubMenusRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Menu.class)) {
            return clazz.cast(io.realm.MenuRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class)) {
            return clazz.cast(io.realm.MenuOrdersRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Order.class)) {
            return clazz.cast(io.realm.OrderRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class)) {
            return clazz.cast(io.realm.OrderItemRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class)) {
            return clazz.cast(io.realm.OrderOptionRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Session.class)) {
            return clazz.cast(io.realm.SessionRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.User.class)) {
            return clazz.cast(io.realm.UserRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class)) {
            return clazz.cast(io.realm.UserLocationRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Club.class)) {
            return clazz.cast(io.realm.ClubRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.ClubMenus.class)) {
            return clazz.cast(io.realm.ClubMenusRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Menu.class)) {
            return clazz.cast(io.realm.MenuRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class)) {
            return clazz.cast(io.realm.MenuOrdersRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Order.class)) {
            return clazz.cast(io.realm.OrderRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class)) {
            return clazz.cast(io.realm.OrderItemRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class)) {
            return clazz.cast(io.realm.OrderOptionRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Session.class)) {
            return clazz.cast(io.realm.SessionRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.User.class)) {
            return clazz.cast(io.realm.UserRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class)) {
            return clazz.cast(io.realm.UserLocationRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Club.class)) {
            return clazz.cast(io.realm.ClubRealmProxy.createDetachedCopy((com.rhinoactive.foreorder_golf_employee.models.Club) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.ClubMenus.class)) {
            return clazz.cast(io.realm.ClubMenusRealmProxy.createDetachedCopy((com.rhinoactive.foreorder_golf_employee.models.ClubMenus) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Menu.class)) {
            return clazz.cast(io.realm.MenuRealmProxy.createDetachedCopy((com.rhinoactive.foreorder_golf_employee.models.Menu) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.MenuOrders.class)) {
            return clazz.cast(io.realm.MenuOrdersRealmProxy.createDetachedCopy((com.rhinoactive.foreorder_golf_employee.models.MenuOrders) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Order.class)) {
            return clazz.cast(io.realm.OrderRealmProxy.createDetachedCopy((com.rhinoactive.foreorder_golf_employee.models.Order) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderItem.class)) {
            return clazz.cast(io.realm.OrderItemRealmProxy.createDetachedCopy((com.rhinoactive.foreorder_golf_employee.models.OrderItem) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.OrderOption.class)) {
            return clazz.cast(io.realm.OrderOptionRealmProxy.createDetachedCopy((com.rhinoactive.foreorder_golf_employee.models.OrderOption) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.Session.class)) {
            return clazz.cast(io.realm.SessionRealmProxy.createDetachedCopy((com.rhinoactive.foreorder_golf_employee.models.Session) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.User.class)) {
            return clazz.cast(io.realm.UserRealmProxy.createDetachedCopy((com.rhinoactive.foreorder_golf_employee.models.User) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.rhinoactive.foreorder_golf_employee.models.UserLocation.class)) {
            return clazz.cast(io.realm.UserLocationRealmProxy.createDetachedCopy((com.rhinoactive.foreorder_golf_employee.models.UserLocation) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
