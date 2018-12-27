import java.time.LocalDateTime

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
def now = LocalDateTime.now()
WebUI.comment("Now it is ${now}!")
println("Now it is ${now}")