// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: simple.proto

package resources.generated

final case class SimpleTest (
	`requiredField`: Int = 0,
	`optionalField`: Option[Float] = None,
	`repeatedField`: Vector[String] = Vector.empty[String],
	`type`: Int = 0
) extends com.google.protobuf.GeneratedMessageLite
	with net.sandrogrzicic.scalabuff.Message[SimpleTest] {

	def getOptionalField = `optionalField`.getOrElse(0.0f)

	def setOptionalField(_f: Float) = copy(`optionalField` = _f)
	def setRepeatedField(_i: Int, _v: String) = copy(`repeatedField` = `repeatedField`.updated(_i, _v))
	def addRepeatedField(_f: String) = copy(`repeatedField` = `repeatedField` :+ _f)
	def addAllRepeatedField(_f: String*) = copy(`repeatedField` = `repeatedField` ++ _f)
	def addAllRepeatedField(_f: TraversableOnce[String]) = copy(`repeatedField` = `repeatedField` ++ _f)

	def clearRequiredField = copy(`requiredField` = 0)
	def clearOptionalField = copy(`optionalField` = None)
	def clearRepeatedField = copy(`repeatedField` = Vector.empty[String])
	def clearType = copy(`type` = 0)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeInt32(1, `requiredField`)
		if (`optionalField`.isDefined) output.writeFloat(2, `optionalField`.get)
		for (_v <- `repeatedField`) output.writeString(3, _v)
		output.writeInt32(4, `type`)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeInt32Size(1, `requiredField`)
		if (`optionalField`.isDefined) size += computeFloatSize(2, `optionalField`.get)
		for (_v <- `repeatedField`) size += computeStringSize(3, _v)
		size += computeInt32Size(4, `type`)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): SimpleTest = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __requiredField: Int = 0
		var __optionalField: Option[Float] = `optionalField`
		val __repeatedField: collection.mutable.Buffer[String] = `repeatedField`.toBuffer
		var __type: Int = 0

		def __newMerged = SimpleTest(
			__requiredField,
			__optionalField,
			Vector(__repeatedField: _*),
			__type
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 8 => __requiredField = in.readInt32()
			case 21 => __optionalField = in.readFloat()
			case 26 => __repeatedField += in.readString()
			case 32 => __type = in.readInt32()
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: SimpleTest) = {
		SimpleTest(
			m.`requiredField`,
			m.`optionalField`.orElse(`optionalField`),
			`repeatedField` ++ m.`repeatedField`,
			m.`type`
		)
	}

	def getDefaultInstanceForType = SimpleTest.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = this
	def toBuilder = this
}

object SimpleTest {
	@reflect.BeanProperty val defaultInstance = new SimpleTest()

	val REQUIRED_FIELD_FIELD_NUMBER = 1
	val OPTIONAL_FIELD_FIELD_NUMBER = 2
	val REPEATED_FIELD_FIELD_NUMBER = 3
	val TYPE_FIELD_NUMBER = 4

}

object Simple {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

}
