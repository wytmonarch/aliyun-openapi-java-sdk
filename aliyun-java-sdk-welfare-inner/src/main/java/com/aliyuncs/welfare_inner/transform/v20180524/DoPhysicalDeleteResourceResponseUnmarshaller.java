/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.welfare_inner.transform.v20180524;

import com.aliyuncs.welfare_inner.model.v20180524.DoPhysicalDeleteResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DoPhysicalDeleteResourceResponseUnmarshaller {

	public static DoPhysicalDeleteResourceResponse unmarshall(DoPhysicalDeleteResourceResponse doPhysicalDeleteResourceResponse, UnmarshallerContext context) {
		
		doPhysicalDeleteResourceResponse.setInterrupt(context.booleanValue("DoPhysicalDeleteResourceResponse.Interrupt"));
		doPhysicalDeleteResourceResponse.setInvoker(context.stringValue("DoPhysicalDeleteResourceResponse.Invoker"));
		doPhysicalDeleteResourceResponse.setPk(context.stringValue("DoPhysicalDeleteResourceResponse.Pk"));
		doPhysicalDeleteResourceResponse.setBid(context.stringValue("DoPhysicalDeleteResourceResponse.Bid"));
		doPhysicalDeleteResourceResponse.setHid(context.longValue("DoPhysicalDeleteResourceResponse.Hid"));
		doPhysicalDeleteResourceResponse.setCountry(context.stringValue("DoPhysicalDeleteResourceResponse.Country"));
		doPhysicalDeleteResourceResponse.setTaskIdentifier(context.stringValue("DoPhysicalDeleteResourceResponse.TaskIdentifier"));
		doPhysicalDeleteResourceResponse.setTaskExtraData(context.stringValue("DoPhysicalDeleteResourceResponse.TaskExtraData"));
		doPhysicalDeleteResourceResponse.setGmtWakeup(context.stringValue("DoPhysicalDeleteResourceResponse.GmtWakeup"));
		doPhysicalDeleteResourceResponse.setSuccess(context.booleanValue("DoPhysicalDeleteResourceResponse.Success"));
		doPhysicalDeleteResourceResponse.setMessage(context.stringValue("DoPhysicalDeleteResourceResponse.Message"));
	 
	 	return doPhysicalDeleteResourceResponse;
	}
}