import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// ExpandoMetaClass http://groovy-lang.org/metaprogramming.html#metaprogramming_emc

// https://github.com/katalon-studio/katalon-studio-testing-framework/blob/master/Include/scripts/groovy/com/kms/katalon/core/keyword/builtin/CommentKeyword.groovy
com.kms.katalon.core.keyword.builtin.CommentKeyword.metaClass.comment = { 
	String message -> 
		println message;
		logger.logInfo(message)
	}

String tcName = "TC2"

WebUI.comment("Hello from " + tcName)