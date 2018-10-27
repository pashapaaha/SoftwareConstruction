package facadeLab

sealed class Device {
    abstract fun use()


    object USBDevice : Device() {
        override fun use() {
            println("USB предоставляет информацию")
        }
    }

    object PrinterDevice : Device() {
        override fun use() {
            println("Принтер печатает текст")
        }
    }

    object MouseDevice : Device() {
        override fun use() {
            println("Мышь управляет курсором")
        }
    }
}