package ideajms.brokerwindow

import com.intellij.openapi.options.SettingsEditorConfigurable

class BrokerSettingsEditorConfigurable extends SettingsEditorConfigurable[BrokerSourceSettings](new BrokerConfigEditor(), new BrokerSourceSettings()) {
  override def getDisplayName: String = "Broker Editor"

  override def getHelpTopic: String = "NotYetAvailable"
}
