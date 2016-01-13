package ideajms.action

import com.intellij.openapi.actionSystem.{AnAction, AnActionEvent}
import ideajms.brokerwindow.BrokerDialog

class ShowAddBrokerDialog extends AnAction {
  override def actionPerformed(e: AnActionEvent): Unit = {
    new BrokerDialog(e).show()
  }
}
