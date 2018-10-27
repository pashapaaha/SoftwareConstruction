package facadeLab

class PlugAndPlay(device: Device) {

    private val driver: Driver<Device> = when (device){
        is Device.MouseDevice -> MouseDriver(device)
        is Device.USBDevice -> USBDriver(device)
        is Device.PrinterDevice -> PrinterDriver(device)
    }

    init {
        driver.openDevice()
    }

    fun useDevice(){

        driver.useDevice()
    }
}