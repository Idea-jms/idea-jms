package ideajms.drivers

import ideajms.model.Driver

object SupportedDrivers {
  def supportedDrivers(): List[Driver] = List[Driver](
    new Driver("ActiveMQ"),
    new Driver("RabbitMQ"),
    new Driver("TibcoEMS")
  )
}
