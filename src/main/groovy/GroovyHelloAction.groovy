import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages

class GroovyHelloAction extends AnAction {
    @Override
    void actionPerformed(AnActionEvent e) {
        Project project = e.getData(CommonDataKeys.PROJECT)
        Messages.showMessageDialog(project, "Hello from groovy", "title", Messages.getInformationIcon())
    }
}
