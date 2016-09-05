package datatypes42

import groovy.transform.CompileStatic
import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode(includeFields = true)
@CompileStatic
class Percentage implements Comparable<Percentage>, Serializable {

	@SuppressWarnings("GroovyUnusedDeclaration")
	private static final long serialVersionUID = 1L;

	private static final short INTERNAL_VALUE_MIN = 0
	private static final short INTERNAL_VALUE_MAX = 100

	public static final MIN_VALUE = fromNumber(INTERNAL_VALUE_MIN)
	public static final MAX_VALUE = fromNumber(INTERNAL_VALUE_MAX)

	private final short internalValue;

	public Percentage(final short value) {
		this.internalValue = value
	}

	static Percentage fromString(String value) {
		String withoutProzent = value.replace( "%", "")
		return new Percentage(Short.parseShort(withoutProzent.trim()));
	}

	static Percentage fromNumber(Number value) {
		return new Percentage(value.shortValue());
	}

	Short toNumber() {
		return internalValue
	}

	@Override
	String toString() {
		return "${internalValue}%".toString()
	}

	@Override
	int compareTo(final Percentage o) {
		def thiz = Short.valueOf(internalValue)
		def that = Short.valueOf(o.internalValue)
		return thiz.compareTo(that);
	}
}
