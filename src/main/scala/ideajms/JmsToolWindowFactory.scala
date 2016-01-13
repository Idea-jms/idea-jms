package ideajms

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.{ToolWindow, ToolWindowFactory}
import com.intellij.ui.content.ContentFactory.SERVICE._
import ideajms.toolwindow.JmsView

class JmsToolWindowFactory(jmsView: JmsView) extends ToolWindowFactory {

  override def createToolWindowContent(project: Project, toolWindow: ToolWindow): Unit = {
    toolWindow.setAvailable(true, null)
    toolWindow.setTitle("Jms")
    toolWindow.getContentManager.addContent(
      getInstance.createContent(jmsView, "", false)
    )
  }
}
