// Generated by view binder compiler. Do not edit!
package info.nightscout.androidaps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import info.nightscout.androidaps.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityInsightPairingInformationBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView bluetoothAddress;

  @NonNull
  public final TextView btInfoPageVersion;

  @NonNull
  public final TextView manufacturingDate;

  @NonNull
  public final TextView mdTelSwVersion;

  @NonNull
  public final TextView pcProcSwVersion;

  @NonNull
  public final TextView releaseSwVersion;

  @NonNull
  public final TextView safetyProcSwVersion;

  @NonNull
  public final TextView serialNumber;

  @NonNull
  public final TextView systemIdAppendix;

  @NonNull
  public final TextView uiProcSwVersion;

  private ActivityInsightPairingInformationBinding(@NonNull ScrollView rootView,
      @NonNull TextView bluetoothAddress, @NonNull TextView btInfoPageVersion,
      @NonNull TextView manufacturingDate, @NonNull TextView mdTelSwVersion,
      @NonNull TextView pcProcSwVersion, @NonNull TextView releaseSwVersion,
      @NonNull TextView safetyProcSwVersion, @NonNull TextView serialNumber,
      @NonNull TextView systemIdAppendix, @NonNull TextView uiProcSwVersion) {
    this.rootView = rootView;
    this.bluetoothAddress = bluetoothAddress;
    this.btInfoPageVersion = btInfoPageVersion;
    this.manufacturingDate = manufacturingDate;
    this.mdTelSwVersion = mdTelSwVersion;
    this.pcProcSwVersion = pcProcSwVersion;
    this.releaseSwVersion = releaseSwVersion;
    this.safetyProcSwVersion = safetyProcSwVersion;
    this.serialNumber = serialNumber;
    this.systemIdAppendix = systemIdAppendix;
    this.uiProcSwVersion = uiProcSwVersion;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityInsightPairingInformationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityInsightPairingInformationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_insight_pairing_information, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityInsightPairingInformationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bluetooth_address;
      TextView bluetoothAddress = rootView.findViewById(id);
      if (bluetoothAddress == null) {
        break missingId;
      }

      id = R.id.bt_info_page_version;
      TextView btInfoPageVersion = rootView.findViewById(id);
      if (btInfoPageVersion == null) {
        break missingId;
      }

      id = R.id.manufacturing_date;
      TextView manufacturingDate = rootView.findViewById(id);
      if (manufacturingDate == null) {
        break missingId;
      }

      id = R.id.md_tel_sw_version;
      TextView mdTelSwVersion = rootView.findViewById(id);
      if (mdTelSwVersion == null) {
        break missingId;
      }

      id = R.id.pc_proc_sw_version;
      TextView pcProcSwVersion = rootView.findViewById(id);
      if (pcProcSwVersion == null) {
        break missingId;
      }

      id = R.id.release_sw_version;
      TextView releaseSwVersion = rootView.findViewById(id);
      if (releaseSwVersion == null) {
        break missingId;
      }

      id = R.id.safety_proc_sw_version;
      TextView safetyProcSwVersion = rootView.findViewById(id);
      if (safetyProcSwVersion == null) {
        break missingId;
      }

      id = R.id.serial_number;
      TextView serialNumber = rootView.findViewById(id);
      if (serialNumber == null) {
        break missingId;
      }

      id = R.id.system_id_appendix;
      TextView systemIdAppendix = rootView.findViewById(id);
      if (systemIdAppendix == null) {
        break missingId;
      }

      id = R.id.ui_proc_sw_version;
      TextView uiProcSwVersion = rootView.findViewById(id);
      if (uiProcSwVersion == null) {
        break missingId;
      }

      return new ActivityInsightPairingInformationBinding((ScrollView) rootView, bluetoothAddress,
          btInfoPageVersion, manufacturingDate, mdTelSwVersion, pcProcSwVersion, releaseSwVersion,
          safetyProcSwVersion, serialNumber, systemIdAppendix, uiProcSwVersion);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
