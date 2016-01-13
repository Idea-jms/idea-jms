package ideajms.brokerwindow

import java.awt.BorderLayout
import java.awt.BorderLayout._
import javax.swing.{DefaultListModel, JComponent, JPanel}

import com.intellij.openapi.options.SettingsEditor
import com.intellij.ui.OnePixelSplitter
import com.intellij.ui.ScrollPaneFactory.createScrollPane
import com.intellij.ui.components.JBList
import com.intellij.ui.components.panels.NonOpaquePanel
import com.intellij.util.ui.UIUtil.{SIDE_PANEL_BACKGROUND, setBackgroundRecursively}

class BrokerConfigEditor extends SettingsEditor[BrokerSourceSettings] {
  override def createEditor(): JComponent = new DividedWindow(new LeftBrokerPanel(), new RightBrokerPanel())

  override def resetEditorFrom(s: BrokerSourceSettings): Unit = {}

  override def applyEditorTo(s: BrokerSourceSettings): Unit = {}
}


class DividedWindow(leftPanel: JComponent, rightPanel: JComponent) extends NonOpaquePanel(new BorderLayout()) {
  fixLeftAndRightPanel()
  setDialogDimensions()

  def fixLeftAndRightPanel(): Unit = {
    val splitter = new OnePixelSplitter(false, 0.25F)
    splitter.setFirstComponent(leftPanel)
    splitter.setSecondComponent(rightPanel)
    add(splitter, CENTER)
  }

  def setDialogDimensions(): Unit = {
    val size = getPreferredSize
    size.width = Math.max(size.width, 1024)
    size.height = Math.max(size.height, 768)
    setPreferredSize(size)
  }
}

class LeftBrokerPanel extends JPanel {
  val driversList = new JBList(new DefaultListModel[Object])
  val scroll = createScrollPane(driversList, true)
  add(driversList)
  setBackgroundRecursively(this, SIDE_PANEL_BACKGROUND)
}

class RightBrokerPanel extends JPanel {
  val brokerDetails = new JPanel()
  val scroll = createScrollPane(brokerDetails, true)
  add(brokerDetails)
  setBackgroundRecursively(this, SIDE_PANEL_BACKGROUND)
}
