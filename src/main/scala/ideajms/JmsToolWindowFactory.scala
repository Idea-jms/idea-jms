package ideajms

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.{ToolWindow, ToolWindowFactory}
import com.intellij.ui.content.{Content, ContentFactory}
import ideajms.view.JmsView

class JmsToolWindowFactory() extends ToolWindowFactory {

  override def createToolWindowContent(project: Project, toolWindow: ToolWindow): Unit = {
    toolWindow.setAvailable(true, null)
    toolWindow.setTitle("Jms")
    val contentFactory: ContentFactory = ContentFactory.SERVICE.getInstance
    val view: JmsView = new JmsView
    view.initialize
    val content: Content = contentFactory.createContent(view, "", false)
    toolWindow.getContentManager.addContent(content)
  }
}
