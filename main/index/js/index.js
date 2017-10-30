		/**
		*===================================ȫ��ҳ��/����===================================
		**/
		var pageOf={
					"minPageWidth":1000, //ҳ����С���
					"bannerInterval":10000,
					"style-color":"#1ab394"
		}
		/**
		*���� end
		**/

		window.onload = function () {
			
				var mc = new mobleClass();
				mc.bindClick();
				/**
				*�˵��仯
				*/
				toolsClass.menuOnscroll();
				/**
				*����init
				*/
				initClass.initBanner();
				initClass.initScrollPic();
				/**
				*ҳ��ͼƬ������
				*/
				toolsClass.imgLazy();
		}
		
		window.onresize =  function () {
				/**
				*�˵��仯
				*/
				toolsClass.menuOnscroll();
		}
		
		window.onscroll = function (){
				/**
				*�˵��仯
				*/
				toolsClass.menuOnscroll();
				
				/**
				*ҳ��ͼƬ������
				*/
				toolsClass.imgLazy();
		}
		
		/**
		*===================================ҳ�����===================================
		**/
		var pageParams={
			"bannerIndex":-1,     //��¼����banner�±�
			"bannerIntervalId":null, //bannerʱ���������
			"logoChangeIntervalTime":20 //logo���㺯�����仯���ʱ��
		}
		
		/**
		*===================================��ʼ���� begin===================================
		**/
		var initClass={
			initBanner:function (){
			 	userClass.showBannerRight();
				pageParams.bannerIntervalId = setInterval("userClass.showBannerRight()",pageOf.bannerInterval);
			},
			initScrollPic:function(){
				toolsClass.appendTeamUser("teamUserUl");
				toolsClass.createScrollPic("scrollPic","LeftArr","RightArr");
			}
		}
		
		
		/**
		*===================================�û����� begin===================================
		**/
		var userClass={
				showBannerLeft(){
					pageParams.bannerIndex--;
					if(pageParams.bannerIndex<0){
						pageParams.bannerIndex=banners.length-1;
					}
					toolsClass.showBanner();
				},
				showBannerRight(){
					pageParams.bannerIndex++;
					if(pageParams.bannerIndex==banners.length){
						pageParams.bannerIndex=0;
					}
					toolsClass.showBanner();
				},
				openDatasEjectDiv(_index,thisObj){
					
					/**
					*	����td css��ԭ
					*/
					var tds = $("td[name='showDatasTd']");
					var extendsShow = false; //�Ƿ����ڲ鿴��
					$.each(tds,function(_index,_obj){
						
							if(_obj.style.color){
								extendsShow =true; //������ʽ����Ϊ�û��е������һ���鿴
							}
							
							if(_obj!=thisObj){
										_obj.style.color="";
							}
					});
					
					/**
					**�����ж�
					*/
					var isShow = "show";
					if(!thisObj.style.color){
						thisObj.style.color= pageOf["style-color"];
						isShow = "show";
					}else{
						thisObj.style.color="";
						isShow = "close";
					}
					
				
					
					if("close"==isShow){
						$("#showDatasEjectImgDiv").slideUp("slow");
					}
					
					if("show"==isShow){
						
						var waitTime = 1; 
						if(extendsShow){
							$("#showDatasEjectImgDiv").slideUp("slow");
							/**�в鿴������Ҫ�ر�ʱ�䣬û�в鿴��ֱ�Ӵ�**/
							waitTime = 700;
						}
					
						setTimeout(function(){
								$("#showDatasEjectImgDiv").html("");
								var showData = showDatas[_index];
								var showHeight = showData["h"];
								var imgNames = showData["imgs"].split(",");
								
								$.each(imgNames,function(index,value){
											var html = "<div><img src=\"index\\img\\datas\\"+value+"\"></div>"
											$("#showDatasEjectImgDiv").append(html);
								
								});
								
								$("#showDatasEjectImgDiv").slideDown("slow").animate({height:showHeight});
							
							},waitTime);
					}
					
				},
				menuScrollMove(_id){
						$("html,body").animate({scrollTop: $("#"+_id).offset().top-80}, 1000);	
				}
		}
		/**
		*�û����� end
		**/
		
		
		/**
		*===================================������ begin===================================
		**/
		var toolsClass={
			showBanner:function(){
				var bannerObj = banners[pageParams.bannerIndex];
				var urlName =  bannerObj.urlName;
				$("#banner").css("backgroundImage","url('index/img/bg/"+urlName+"')");
				$("#bannerTitle").html(bannerObj.title);
				$("#bannerText").html(bannerObj.text);
			},
			appendTeamUser:function(appendDivId){
					$.each(users,function(index,obj){
						var html='<li>'+
												 '<div class="teamDiv">'+
															'<div class="teamBodyDiv">'+
																'<div><img class="teamimg" src="" imgLazy-src="index/img/team/'+obj.imgName+'" alt=""/></div>'+
																'<div class="teamUserName">'+obj.userName+'</div>'+
																'<div><a href="https://github.com/'+obj.githubId+'"><img class="githubimg" src="index/img/logo/github.png" imgLazy-src="index/img/logo/github.png"></img></a></div>'+
																'<div class="teamUserDesc">'+obj.userDesc+'</div>'+
															'</div>'+
															'</div>'+
						            '</li>';
						$("#"+appendDivId).append(html);	
					})
				},
				createScrollPic:function(scrollContId,arrLeftId,arrRightId){
				    var scrollPic = new ScrollPic();
				    scrollPic.scrollContId   = scrollContId; //��������ID
				    scrollPic.arrLeftId      = arrLeftId;//���ͷID
				    scrollPic.arrRightId     = arrRightId; //�Ҽ�ͷID

				    scrollPic.frameWidth     = 800;//��ʾ����
				    //scrollPic.frameWidth     = document.body.clientWidth;
				    scrollPic.pageWidth      = 250; //��ҳ���

				    scrollPic.speed          = 10; //�ƶ��ٶ�(��λ���룬ԽСԽ��)
				    scrollPic.space          = 10; //ÿ���ƶ�����(��λpx��Խ��Խ��)
				    scrollPic.autoPlay       = false; //�Զ�����
				    scrollPic.autoPlayTime   = 300; //�Զ����ż��ʱ��(��)

				    scrollPic.initialize(); //��ʼ��
				}
				,menuOnscroll:function(){
					
					//С����С���  
					var hidnWidth = document.documentElement.scrollWidth || document.body.scrollWidth; 
					
					if(hidnWidth <= pageOf.minPageWidth){
						$("#menuDown").show();
						$("#menu").hide();
					}else{
						thisHeightChange();
					}
					
					function thisHeightChange(){
							var stop = document.documentElement.scrollTop || document.body.scrollTop;
				
							var hidnHeight = 50; //���ش����߶�
							
							if( stop >= hidnHeight){
								$("#menu").slideUp("slow");
								$("#menuDown").slideDown("slow");
							}else if(stop < hidnHeight){	
								$("#menuDown").slideUp("slow");
								$("#menu").slideDown("slow");
							}
					}
					
				},
				imgLazy(){
	        var aImg = document.querySelectorAll('img');
	        var len = aImg.length;
					/**ͼƬ������*/	
					  var seeHeight = document.documentElement.clientHeight;
            var scrollTop = document.body.scrollTop || document.documentElement.scrollTop;
            for (var i = 0; i < len; i++) {
                if (aImg[i].offsetTop < seeHeight + scrollTop) {
                    if (aImg[i].getAttribute('src') == '') {
                        aImg[i].src = aImg[i].getAttribute('imgLazy-src');
                    }
                }
            }
				}
				
		};
		/**
		*������ end
		**/
		
		/**
		*�ƶ��˴��� begin
		**/
		var  mobleClass = function (){
				
				this.bindClick=function(){
						var showDatasIndex =  $("td[name='showDatasTd']").length;
						
						while (showDatasIndex>0)
					  {
					  		showDatasIndex--;
					 			 var id = "showDatasTd_"+showDatasIndex;
					 			 document.getElementById(id).addEventListener( "click", function(){
					 			 		var _index = this.id.substring(this.id.indexOf("_")+1);
										userClass.openDatasEjectDiv(_index,this);
								},false); 
					  }
											
						
				}	;
			
		};
			/**
		*�ƶ��˴��� end
		**/
		
		
		
		
		