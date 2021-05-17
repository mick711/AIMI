package info.nightscout.androidaps.plugins.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Linfo/nightscout/androidaps/plugins/source/EversensePlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "Linfo/nightscout/androidaps/interfaces/BgSourceInterface;", "injector", "Ldagger/android/HasAndroidInjector;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "nsUpload", "Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/DateUtil;Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;)V", "sensorBatteryLevel", "", "advancedFilteringSupported", "", "getSensorBatteryLevel", "handleNewData", "", "intent", "Landroid/content/Intent;", "app_fullRelease"})
@javax.inject.Singleton()
public final class EversensePlugin extends info.nightscout.androidaps.interfaces.PluginBase implements info.nightscout.androidaps.interfaces.BgSourceInterface {
    private int sensorBatteryLevel = -1;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.utils.DateUtil dateUtil = null;
    private final info.nightscout.androidaps.plugins.general.nsclient.NSUpload nsUpload = null;
    
    @java.lang.Override()
    public boolean advancedFilteringSupported() {
        return false;
    }
    
    @java.lang.Override()
    public void handleNewData(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public int getSensorBatteryLevel() {
        return 0;
    }
    
    @javax.inject.Inject()
    public EversensePlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil dateUtil, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.NSUpload nsUpload) {
        super(null, null, null, null);
    }
}