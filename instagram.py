#!/usr/bin/env python
# coding: utf-8

# In[20]:


get_ipython().system('pip install beautifulsoup4')


# In[23]:


import requests
from bs4 import BeautifulSoup
def scrapInstagram(soup1):
    insta_Data = []
    for meta in soup1.find_all(name="meta",attrs={"property":"og:description"}):
        insta_Data = meta['content'].split()
        
    followers = insta_Data[0]
    following = insta_Data[2]
    posts = insta_Data[4]
    
    print("\n INSTAGRAM USERNAME :  ", insta_User)
    print("\n No OF POSTS : ", posts)
    print("\n No OF FOLLOWERS : ", followers)
    print("\n No OF FOLLOWING : ", following)


# In[24]:


if __name__ == "__main__" :
    insta_User = input("\n ENTER INSTAGRAM USERNAME : ")
    insta_URL = "https://www.instagram.com/" + insta_User
    insta_Page = requests.get(insta_URL)
    soup = BeautifulSoup(insta_Page.text,"html.parser")
    scrapInstagram(soup)


# In[ ]:




