package lib.kalu.permission.core.wrapper;

import android.app.Activity;
import android.support.v4.app.Fragment;

import java.util.List;
import java.util.Map;

import lib.kalu.permission.core.intent.IntentType;
import lib.kalu.permission.core.listener.OnAnnotationChangeListener;
import lib.kalu.permission.core.listener.OnPermissionChangeListener;

public interface WrapperImp {

    int TARGET_ACTIVITY = 1;
    int TARGET_FRAGMENT = 2;

    String getClassName();

    Activity getActivity();

    Fragment getFragment();

    int getTarget();

    WrapperImp setForce(boolean force);

    boolean isForce();

    WrapperImp setPageType(@IntentType int pageType);

    @IntentType
    int getPageType();

    OnAnnotationChangeListener getAnnotationChangeListener(String className);

    OnPermissionChangeListener getPermissionChangeListener();

    WrapperImp setOnPermissionChangeListener(OnPermissionChangeListener listener);

    /*******************************************************************/

    int getRequestCode();

    WrapperImp setRequestCode(int code);

    WrapperImp setPermissionName(String... name);

    List<String> getPermission();

    /*******************************************************************/

    void request();
}