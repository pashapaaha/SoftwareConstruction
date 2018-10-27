package facadeLab

import factoryLab.inputString


fun main(args: Array<String>) {
    val device = getDevice()
    val plugAndPlay = PlugAndPlay(device)
    plugAndPlay.useDevice()
}

fun getDevice() : Device{
    println("""
        Укажите усройство:
        1. Флешка
        2. Принтер
        3. Мышь
    """.trimIndent())
    return when (inputString){
        "1" -> Device.USBDevice
        "2" -> Device.PrinterDevice
        else -> Device.MouseDevice
    }
}