package facadeLab

sealed class Device {
    abstract fun use()


    class USBDevice : Device() {
        override fun use() {
            println("USB предоставляет информацию")
        }
    }

    class PrinterDevice : Device() {
        override fun use() {
            println("Принтер печатает текст")
        }
    }

    class MouseDevice : Device() {
        override fun use() {
            println("Мышь управляет курсором")
        }
    }
}