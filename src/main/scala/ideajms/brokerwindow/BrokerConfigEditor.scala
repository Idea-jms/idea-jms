package ideajms.brokerwindow

import javax.swing.{JButton, JComponent}

import com.intellij.openapi.options.SettingsEditor

class BrokerConfigEditor extends SettingsEditor[BrokerSourceSettings] {
  override def createEditor(): JComponent = {
    new JButton("Dummy broker editor")
  }

  override def resetEditorFrom(s: BrokerSourceSettings): Unit = {}

  override def applyEditorTo(s: BrokerSourceSettings): Unit = {}
}
