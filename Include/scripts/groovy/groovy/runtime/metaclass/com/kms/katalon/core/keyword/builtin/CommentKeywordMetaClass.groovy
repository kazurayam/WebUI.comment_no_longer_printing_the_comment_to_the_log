package groovy.runtime.metaclass.com.kms.katalon.core.keyword.builtin

import com.kms.katalon.core.logging.KeywordLogger

class CommentKeywordMetaClass extends DelegatingMetaClass {

	CommentKeywordMetaClass(MetaClass metaClass) {
		super(metaClass)
	}

	
	Object invokeMethod(Object object, String method, Object[] args) {
		println "method=${method}"
		try {
			throw new RuntimeException()
		} catch (Exception e) {
			e.printStackTrace()
		}
		if (method == /comment/) {
			println "Howdy!"
		} else {
			return super.invokeMethod(object, method, args)
		}
	}
	
	
	// http://groovy-lang.org/metaprogramming.html ExpandoMetaClass
}