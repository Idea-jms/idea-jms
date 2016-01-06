import com.intellij.openapi.actionSystem.{AnAction, AnActionEvent, CommonDataKeys}
import com.intellij.openapi.ui.Messages
import com.intellij.openapi.ui.Messages.showMessageDialog

class ScalaHelloAction extends AnAction {
  override def actionPerformed(e: AnActionEvent): Unit = {
    showMessageDialog(e.getData(CommonDataKeys.PROJECT), "Hello from Scala", "title", Messages.getInformationIcon())
  }
}