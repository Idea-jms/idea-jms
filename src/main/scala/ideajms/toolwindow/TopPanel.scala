package ideajms.toolwindow

import javax.swing.{BoxLayout, JComponent, JPanel}

import com.intellij.openapi.actionSystem.ActionToolbar.NOWRAP_LAYOUT_POLICY
import com.intellij.openapi.actionSystem._

class TopPanel extends JPanel {
  setLayout(new BoxLayout(this, BoxLayout.Y_AXIS))
  setAlignmentX(0)
  add(createToolbar)

  def createToolbar: JComponent = {
    val toolbarActions: ActionGroup = ActionManager.getInstance().getAction("brokerActions").asInstanceOf[ActionGroup]
    val toolbar: ActionToolbar = ActionManager.getInstance().createActionToolbar("JmsToolbar", toolbarActions, true)
    toolbar.setLayoutPolicy(NOWRAP_LAYOUT_POLICY)
    toolbar.getComponent
  }
}
