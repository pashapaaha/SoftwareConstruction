package facadeLab


fun main(args: Array<String>) {
    val device = Device.USBDevice()
    val plugAndPlay = PlugAndPlay(device)
    plugAndPlay.useDevice()
}