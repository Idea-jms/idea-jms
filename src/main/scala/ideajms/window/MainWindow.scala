package ideajms.window

import javax.swing.JTextField

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.{ToolWindow, ToolWindowFactory}
import com.intellij.ui.content.{Content, ContentFactory}

class MainWindow extends ToolWindowFactory {
  override def createToolWindowContent(project: Project, toolWindow: ToolWindow): Unit = {
    val field: JTextField = new JTextField("plugin content")
    val contentFactory: ContentFactory = ContentFactory.SERVICE.getInstance
    val content: Content = contentFactory.createContent(field, "", false)
    toolWindow.getContentManager.addContent(content)
  }
}
