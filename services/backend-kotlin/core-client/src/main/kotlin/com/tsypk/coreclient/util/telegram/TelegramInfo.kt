package com.tsypk.coreclient.util.telegram

object TelegramInfo {
    val ADMIN_IDS = setOf(778398611L, 281713218L, 5979900457L, 715219007L)

    object SupplierBot {
        const val username = "@gorbushka_supplier_bot"
    }

    object ResellerBot {
        const val username = "@gorbushka_bot"
    }

    object Support {
        const val username = "@romanmedvedev93"
    }

    object Channel {
        const val username = "@roman_medvedev93"
        const val chatId = -1001720385192
    }

    object PriceListChannel {
        const val username = "@@gorbushka_pricelist"
        const val chatId = -1001972451860
    }
}
