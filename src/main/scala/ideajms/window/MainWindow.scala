package ideajms.window

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.{ToolWindow, ToolWindowFactory}
import com.intellij.ui.content.{Content, ContentFactory}

class MainWindow extends ToolWindowFactory {
  override def createToolWindowContent(project: Project, toolWindow: ToolWindow): Unit = {
    val contentFactory: ContentFactory = ContentFactory.SERVICE.getInstance
    val content: Content = contentFactory.createContent(JmsTree.getTree, "", false)
    toolWindow.getContentManager.addContent(content)
  }
}
