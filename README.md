# Gilded Rose Requirements Specification

## English
Hi and welcome to team Gilded Rose. As you know, we are a small inn with a prime location in a
prominent city ran by a friendly innkeeper named Allison. We also buy and sell only the finest goods.
Unfortunately, our goods are constantly degrading in quality as they approach their sell by date. We
have a system in place that updates our inventory for us. It was developed by a no-nonsense type named
Leeroy, who has moved on to new adventures. Your task is to add the new feature to our system so that
we can begin selling a new category of items. First an introduction to our system:

- All items have a SellIn value which denotes the number of days we have to sell the item
- All items have a Quality value which denotes how valuable the item is
- At the end of each day our system lowers both values for every item
 
Pretty simple, right? Well this is where it gets interesting:

- Once the sell by date has passed, Quality degrades twice as fast
- The Quality of an item is never negative
- "Aged Brie" actually increases in Quality the older it gets
- The Quality of an item is never more than 50
- "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
- "Backstage passes", like aged brie, increases in Quality as its SellIn value approaches;
Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but
Quality drops to 0 after the concert

We have recently signed a supplier of conjured items. This requires an update to our system:

- "Conjured" items degrade in Quality twice as fast as normal items

Feel free to make any changes to the UpdateQuality method and add any new code as long as everything
still works correctly. However, do not alter the Item class or Items property as those belong to the
goblin in the corner who will insta-rage and one-shot you as he doesn't believe in shared code
ownership (you can make the UpdateQuality method and Items property static if you like, we'll cover
for you).

## 中文
# 镶金玫瑰商店

> 欢迎来到"镶金玫瑰"！这是一家魔兽世界里的小商店，地段超好。老板叫艾利森，是个友善的人。我们出售的商品也都是高质量的。但不妙的是，随着商品逐渐接近保质期，它们的质量也不断下滑。我们用一个IT系统来更新库存信息。开发这个系统的程序员叫"火车王里诺艾"，他开发完系统就跑路了。现在，你的任务就是要在这个系统中添加新的特性，这样我们可以销售新的商品。

首先，简单介绍一下我们的系统：

* 所有商品都有一个"SellIn"值，这是商品的保质期，最好在保质期之内卖掉
* 所有商品都有一个"Quality"值，代表商品的价值
* 每过一天，所有商品的"SellIn"值和"Quality"值都减1

很简单对吧？别着急，有意思的来了……

* 一旦过了保质期，"Quality"就以双倍的速度下滑。
* 陈年干酪（Aged Brie）是一种特殊的商品，放得越久，价值反而越高。
* 商品的价值永远不会小于0，也永远不会超过50。
* "萨弗拉斯，炎魔拉格纳罗斯之手"（Sulfuras，简称炎魔锤）是一种传奇商品，没有保质期的概念，质量也不会下滑。
* 精英牛头人酋长乐队的"后台通行证"（Backstage pass）和陈年干酪有相似之处：越是接近演出日，随着"SellIn"值的增加，商品价值"Quality"值反而上升。在演出前10天，价值每天上升2点；演出前5天，价值每天上升3点。但一旦过了演出日，价值就马上变成0。

我们最近还签了一个供应商，给我们供应魔法召唤物品。这又需要升级我们的系统：

* 魔法（Conjured）商品，比如魔法蛋糕（Conjured Mana Cake）,贬值速度是普通物品的两倍。