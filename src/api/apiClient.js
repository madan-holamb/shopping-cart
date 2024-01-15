
import axios from "axios";
 
export const apiClient = {
  post: async (url, payload, requestHeaders = {}) => {
    try {
      const response = await axios.post(url, payload, {headers : requestHeaders});
      return response.data;
    } catch (error) {
      console.log("error in catch", error);
    }
  },
};
 
 
 