/*
 * Automatically generated by jrpcgen 1.0.7 on 20.02.16 08:08
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package blinkenbone.rpcgen;
import org.acplt.oncrpc.*;
import java.io.IOException;

public class rpc_blinkenlight_api_nametype implements XdrAble {

    public String value;

    public rpc_blinkenlight_api_nametype() {
    }

    public rpc_blinkenlight_api_nametype(String value) {
        this.value = value;
    }

    public rpc_blinkenlight_api_nametype(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeString(value);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        value = xdr.xdrDecodeString();
    }

}
// End of rpc_blinkenlight_api_nametype.java