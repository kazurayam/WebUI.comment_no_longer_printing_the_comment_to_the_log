import java.time.LocalDateTime

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.comment("Hello from TC1")

def now = LocalDateTime.now()
WebUI.comment("Now it is ${now}!")
println("Now it is ${now}")