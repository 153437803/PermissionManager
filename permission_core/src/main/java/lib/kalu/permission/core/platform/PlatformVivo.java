package lib.kalu.permission.core.platform;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;

/**
 * support:
 * 1.Y55A androi:6.0.1/Funtouch 2.6
 * 2.Xplay5A android: 5.1.1/Funtouch 3
 *
 * manager home page, or {@link PlatformGoogle#settingIntent()}
 *
 * Created by joker on 2017/8/4.
 */

public class PlatformVivo extends PlatformGoogle {
    private final String MAIN_CLS = "com.iqoo.secure.MainActivity";
    private final String PKG = "com.iqoo.secure";

    public PlatformVivo(Activity activity) {
        super(activity);
    }

    @Override
    public Intent settingIntent() {
        Intent intent = new Intent();
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra(PACK_TAG, activity.getPackageName());
        ComponentName comp = new ComponentName(PKG, MAIN_CLS);

        // starting Intent { flg=0x10000000 cmp=com.iqoo.secure/.safeguard.PurviewTabActivity (has
        // extras) } from ProcessRecord
//        ComponentName comp = new ComponentName(PKG, "com.iqoo.secure.safeguard.PurviewTabActivity");

        // can enter, but blank
//        try {
//            PackageInfo pi = context.getPackageManager().getPackageInfo(PKG,
//                    PackageManager.GET_ACTIVITIES);
//            for (ActivityInfo activityInfo : pi.activities) {
//                Log.e("TAG", "settingIntent:  " + activityInfo.name);
//                if (activityInfo.name.contains(IN_CLS)) {
//                    comp = new ComponentName(PKG, "com.iqoo.secure.safeguard
// .SoftPermissionDetailActivity");
//                }
//            }
//        } catch (PackageManager.NameNotFoundException e) {
//            e.printStackTrace();
//        }
        intent.setComponent(comp);

        return intent;
    }
}
