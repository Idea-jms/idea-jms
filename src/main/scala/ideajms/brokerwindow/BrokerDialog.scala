package ideajms.brokerwindow

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.options.ex.SingleConfigurableEditor

class BrokerDialog(e: AnActionEvent) extends SingleConfigurableEditor(e.getProject, new BrokerSettingsEditorConfigurable()) {}
