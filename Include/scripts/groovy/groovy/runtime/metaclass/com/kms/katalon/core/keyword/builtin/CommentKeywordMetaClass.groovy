package groovy.runtime.metaclass.com.kms.katalon.core.keyword.builtin

import com.kms.katalon.core.logging.KeywordLogger

class CommentKeywordMetaClass extends DelegatingMetaClass {

	CommentKeywordMetaClass(MetaClass metaClass) {
		super(metaClass)
	}

	CommentKeywordMetaClass(Class theClass) {
		super(theClass)
	}

	Object invokeMethod(Object object, String name, Object[] args) {
		println "name is ${name}"
		if (name =~ /comment/) {
			println "Howdy!"
		} else {
			return super.invokeMethod(object, name, args)
		}
	}
}