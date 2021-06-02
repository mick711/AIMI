// Generated by view binder compiler. Do not edit!
package info.nightscout.androidaps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import info.nightscout.androidaps.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LogsettingsItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView logsettingsDescription;

  @NonNull
  public final CheckBox logsettingsVisibility;

  private LogsettingsItemBinding(@NonNull LinearLayout rootView,
      @NonNull TextView logsettingsDescription, @NonNull CheckBox logsettingsVisibility) {
    this.rootView = rootView;
    this.logsettingsDescription = logsettingsDescription;
    this.logsettingsVisibility = logsettingsVisibility;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LogsettingsItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LogsettingsItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.logsettings_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LogsettingsItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.logsettings_description;
      TextView logsettingsDescription = rootView.findViewById(id);
      if (logsettingsDescription == null) {
        break missingId;
      }

      id = R.id.logsettings_visibility;
      CheckBox logsettingsVisibility = rootView.findViewById(id);
      if (logsettingsVisibility == null) {
        break missingId;
      }

      return new LogsettingsItemBinding((LinearLayout) rootView, logsettingsDescription,
          logsettingsVisibility);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
