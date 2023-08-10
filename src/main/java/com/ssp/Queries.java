package com.ssp;

/**
 * The Service Switching Point (SSP) sends queries to the Service Control Function (SCF)
 * in order to request the execution of services and call control functions in the network.
 * These queries are typically sent using the Transaction Capabilities Application Part (TCAP) protocol,
 * which is a component of the Signaling System No. 7 (SS7) protocol suite.
 *
 * An example of a query that might be sent by the SSP to the SCF could be a request to execute a service
 * such as call forwarding or call waiting. The query would include information about the call, such as
 * the calling and called parties, as well as any relevant service parameters. The SCF would then use
 * this information to execute the requested service and return a response to the SSP indicating
 * the outcome of the request
 */
public interface Queries {
}
