package facadeLab

open class Driver<T: Device> protected constructor(open val device: T){
    private var flag = false
    fun useDevice(){
        if(flag) device.use()
    }
    fun openDevice(){
        flag = true
    }
    fun closeDevice(){
        flag = false
    }
}

class USBDriver(override val device: Device.USBDevice): Driver<Device>(device)

class PrinterDriver(override val device: Device.PrinterDevice): Driver<Device>(device)

class MouseDriver(override val device: Device.MouseDevice): Driver<Device>(device)

