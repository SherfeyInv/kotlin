@_exported import ExportedKotlinPackages
import KotlinRuntime
@_implementationOnly import KotlinBridges_main

public func foo() -> Swift.Int32 {
    return __root___foo()
}
public func return_any_should_append_runtime_import() -> KotlinRuntime.KotlinBase {
    return KotlinRuntime.KotlinBase(__externalRCRef: __root___return_any_should_append_runtime_import())
}
public extension ExportedKotlinPackages.namespace1.local_functions {
    public static func foo() -> Swift.Void {
        return namespace1_local_functions_foo()
    }
}
public extension ExportedKotlinPackages.namespace1.main {
    public static func all_args(
        arg1: Swift.Bool,
        arg2: Swift.Int8,
        arg3: Swift.Int16,
        arg4: Swift.Int32,
        arg5: Swift.Int64,
        arg6: Swift.UInt8,
        arg7: Swift.UInt16,
        arg8: Swift.UInt32,
        arg9: Swift.UInt64,
        arg10: Swift.Float,
        arg11: Swift.Double,
        arg12: Swift.Unicode.UTF16.CodeUnit
    ) -> Swift.Void {
        return namespace1_main_all_args__TypesOfArguments___Bool_int8_t_int16_t_int32_t_int64_t_uint8_t_uint16_t_uint32_t_uint64_t_float_double_uint16_t__(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12)
    }
    public static func foobar(
        param: Swift.Int32
    ) -> Swift.Int32 {
        return namespace1_main_foobar__TypesOfArguments__int32_t__(param)
    }
}
public extension ExportedKotlinPackages.namespace1 {
    public static func bar() -> Swift.Int32 {
        return namespace1_bar()
    }
}
public extension ExportedKotlinPackages.namespace2 {
    public static func foo(
        arg1: Swift.Int32
    ) -> Swift.Int32 {
        return namespace2_foo__TypesOfArguments__int32_t__(arg1)
    }
}
public extension ExportedKotlinPackages.overload {
    public static func foo(
        arg1: Swift.Double
    ) -> Swift.Int32 {
        return overload_foo__TypesOfArguments__double__(arg1)
    }
    public static func foo(
        arg1: Swift.Int32
    ) -> Swift.Int32 {
        return overload_foo__TypesOfArguments__int32_t__(arg1)
    }
}
