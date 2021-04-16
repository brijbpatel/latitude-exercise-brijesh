package com.latitude.exercise;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StockMarketCalculatorBigDecimalTest {

	@SuppressWarnings("deprecation")
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Test
	public void testCalculateBestProfit() throws Exception {
		BigDecimal[] stockPrices = {new BigDecimal(10.0),
									new BigDecimal(7.77),
									new BigDecimal(5.55),
									new BigDecimal(8.88),
									new BigDecimal(11.11),
									new BigDecimal(9.99)};
		BigDecimal profit = StockMarketCalculatorBigDecimal.calculateBestProfit(stockPrices);
		assertEquals(new BigDecimal(5.56).setScale(2, RoundingMode.HALF_UP), profit);
	}

	@Test
	public void testCalculateBest360Indices() throws Exception {
		BigDecimal[] stockPrices = {new BigDecimal(1), new BigDecimal(2), new BigDecimal(3), new BigDecimal(4), new BigDecimal(5), new BigDecimal(6), new BigDecimal(7), new BigDecimal(8), new BigDecimal(9), new BigDecimal(10),
				new BigDecimal(11), new BigDecimal(12), new BigDecimal(13), new BigDecimal(14), new BigDecimal(15), new BigDecimal(16), new BigDecimal(17), new BigDecimal(18), new BigDecimal(19), new BigDecimal(20),
				new BigDecimal(21), new BigDecimal(22), new BigDecimal(23), new BigDecimal(24), new BigDecimal(25), new BigDecimal(26), new BigDecimal(27), new BigDecimal(28), new BigDecimal(29), new BigDecimal(30),
				new BigDecimal(31), new BigDecimal(32), new BigDecimal(33), new BigDecimal(34), new BigDecimal(35), new BigDecimal(36), new BigDecimal(37), new BigDecimal(38), new BigDecimal(39), new BigDecimal(40),
				new BigDecimal(41), new BigDecimal(42), new BigDecimal(43), new BigDecimal(44), new BigDecimal(45), new BigDecimal(46), new BigDecimal(47), new BigDecimal(48), new BigDecimal(49), new BigDecimal(50),
				new BigDecimal(51), new BigDecimal(52), new BigDecimal(53), new BigDecimal(54), new BigDecimal(55), new BigDecimal(56), new BigDecimal(57), new BigDecimal(58), new BigDecimal(59), new BigDecimal(60),
				new BigDecimal(61), new BigDecimal(62), new BigDecimal(63), new BigDecimal(64), new BigDecimal(65), new BigDecimal(66), new BigDecimal(67), new BigDecimal(68), new BigDecimal(69), new BigDecimal(70),
				new BigDecimal(71), new BigDecimal(72), new BigDecimal(73), new BigDecimal(74), new BigDecimal(75), new BigDecimal(76), new BigDecimal(77), new BigDecimal(78), new BigDecimal(79), new BigDecimal(80),
				new BigDecimal(81), new BigDecimal(82), new BigDecimal(83), new BigDecimal(84), new BigDecimal(85), new BigDecimal(86), new BigDecimal(87), new BigDecimal(88), new BigDecimal(89), new BigDecimal(90),
				new BigDecimal(91), new BigDecimal(92), new BigDecimal(93), new BigDecimal(94), new BigDecimal(95), new BigDecimal(96), new BigDecimal(97), new BigDecimal(98), new BigDecimal(99), new BigDecimal(100),
				new BigDecimal(101), new BigDecimal(102), new BigDecimal(103), new BigDecimal(104), new BigDecimal(105), new BigDecimal(106), new BigDecimal(107), new BigDecimal(108), new BigDecimal(109), new BigDecimal(110),
				new BigDecimal(111), new BigDecimal(112), new BigDecimal(113), new BigDecimal(114), new BigDecimal(115), new BigDecimal(116), new BigDecimal(117), new BigDecimal(118), new BigDecimal(119), new BigDecimal(120),
				new BigDecimal(121), new BigDecimal(122), new BigDecimal(123), new BigDecimal(124), new BigDecimal(125), new BigDecimal(126), new BigDecimal(127), new BigDecimal(128), new BigDecimal(129), new BigDecimal(130),
				new BigDecimal(131), new BigDecimal(132), new BigDecimal(133), new BigDecimal(134), new BigDecimal(135), new BigDecimal(136), new BigDecimal(137), new BigDecimal(138), new BigDecimal(139), new BigDecimal(140),
				new BigDecimal(141), new BigDecimal(142), new BigDecimal(143), new BigDecimal(144), new BigDecimal(145), new BigDecimal(146), new BigDecimal(147), new BigDecimal(148), new BigDecimal(149), new BigDecimal(150),
				new BigDecimal(151), new BigDecimal(152), new BigDecimal(153), new BigDecimal(154), new BigDecimal(155), new BigDecimal(156), new BigDecimal(157), new BigDecimal(158), new BigDecimal(159), new BigDecimal(160),
				new BigDecimal(161), new BigDecimal(162), new BigDecimal(163), new BigDecimal(164), new BigDecimal(165), new BigDecimal(166), new BigDecimal(167), new BigDecimal(168), new BigDecimal(169), new BigDecimal(170),
				new BigDecimal(171), new BigDecimal(172), new BigDecimal(173), new BigDecimal(174), new BigDecimal(175), new BigDecimal(176), new BigDecimal(177), new BigDecimal(178), new BigDecimal(179), new BigDecimal(180),
				new BigDecimal(181), new BigDecimal(182), new BigDecimal(183), new BigDecimal(184), new BigDecimal(185), new BigDecimal(186), new BigDecimal(187), new BigDecimal(188), new BigDecimal(189), new BigDecimal(190),
				new BigDecimal(191), new BigDecimal(192), new BigDecimal(193), new BigDecimal(194), new BigDecimal(195), new BigDecimal(196), new BigDecimal(197), new BigDecimal(198), new BigDecimal(199), new BigDecimal(200),
				new BigDecimal(201), new BigDecimal(202), new BigDecimal(203), new BigDecimal(204), new BigDecimal(205), new BigDecimal(206), new BigDecimal(207), new BigDecimal(208), new BigDecimal(209), new BigDecimal(210),
				new BigDecimal(211), new BigDecimal(212), new BigDecimal(213), new BigDecimal(214), new BigDecimal(215), new BigDecimal(216), new BigDecimal(217), new BigDecimal(218), new BigDecimal(219), new BigDecimal(220),
				new BigDecimal(221), new BigDecimal(222), new BigDecimal(223), new BigDecimal(224), new BigDecimal(225), new BigDecimal(226), new BigDecimal(227), new BigDecimal(228), new BigDecimal(229), new BigDecimal(230),
				new BigDecimal(231), new BigDecimal(232), new BigDecimal(233), new BigDecimal(234), new BigDecimal(235), new BigDecimal(236), new BigDecimal(237), new BigDecimal(238), new BigDecimal(239), new BigDecimal(240),
				new BigDecimal(241), new BigDecimal(242), new BigDecimal(243), new BigDecimal(244), new BigDecimal(245), new BigDecimal(246), new BigDecimal(247), new BigDecimal(248), new BigDecimal(249), new BigDecimal(250),
				new BigDecimal(251), new BigDecimal(252), new BigDecimal(253), new BigDecimal(254), new BigDecimal(255), new BigDecimal(256), new BigDecimal(257), new BigDecimal(258), new BigDecimal(259), new BigDecimal(260),
				new BigDecimal(261), new BigDecimal(262), new BigDecimal(263), new BigDecimal(264), new BigDecimal(265), new BigDecimal(266), new BigDecimal(267), new BigDecimal(268), new BigDecimal(269), new BigDecimal(270),
				new BigDecimal(271), new BigDecimal(272), new BigDecimal(273), new BigDecimal(274), new BigDecimal(275), new BigDecimal(276), new BigDecimal(277), new BigDecimal(278), new BigDecimal(279), new BigDecimal(280),
				new BigDecimal(281), new BigDecimal(282), new BigDecimal(283), new BigDecimal(284), new BigDecimal(285), new BigDecimal(286), new BigDecimal(287), new BigDecimal(288), new BigDecimal(289), new BigDecimal(290),
				new BigDecimal(291), new BigDecimal(292), new BigDecimal(293), new BigDecimal(294), new BigDecimal(295), new BigDecimal(296), new BigDecimal(297), new BigDecimal(298), new BigDecimal(299), new BigDecimal(300),
				new BigDecimal(301), new BigDecimal(302), new BigDecimal(303), new BigDecimal(304), new BigDecimal(305), new BigDecimal(306), new BigDecimal(307), new BigDecimal(308), new BigDecimal(309), new BigDecimal(310),
				new BigDecimal(311), new BigDecimal(312), new BigDecimal(313), new BigDecimal(314), new BigDecimal(315), new BigDecimal(316), new BigDecimal(317), new BigDecimal(318), new BigDecimal(319), new BigDecimal(320),
				new BigDecimal(321), new BigDecimal(322), new BigDecimal(323), new BigDecimal(324), new BigDecimal(325), new BigDecimal(326), new BigDecimal(327), new BigDecimal(328), new BigDecimal(329), new BigDecimal(330),
				new BigDecimal(331), new BigDecimal(332), new BigDecimal(333), new BigDecimal(334), new BigDecimal(335), new BigDecimal(336), new BigDecimal(337), new BigDecimal(338), new BigDecimal(339), new BigDecimal(340),
				new BigDecimal(341), new BigDecimal(342), new BigDecimal(343), new BigDecimal(344), new BigDecimal(345), new BigDecimal(346), new BigDecimal(347), new BigDecimal(348), new BigDecimal(349), new BigDecimal(350),
				new BigDecimal(351), new BigDecimal(352), new BigDecimal(353), new BigDecimal(354), new BigDecimal(355), new BigDecimal(356), new BigDecimal(357), new BigDecimal(358), new BigDecimal(359), new BigDecimal(360)};
		BigDecimal profit = StockMarketCalculatorBigDecimal.calculateBestProfit(stockPrices);
		assertEquals(new BigDecimal(359).setScale(2, RoundingMode.HALF_UP), profit);
	}

	@Test
	public void testCalculateBestProfitNull() throws Exception {
		exceptionRule.expect(InputValidationExcetion.class);
		exceptionRule.expectMessage("Null of empty data");
		int[] stockPrices = null;
		StockMarketCalculatorInt.calculateBestProfit(stockPrices);
	}

	@Test
	public void testCalculateBestProfitEmpty() throws Exception {
		exceptionRule.expect(InputValidationExcetion.class);
		exceptionRule.expectMessage("Null of empty data");
		int[] stockPrices = {};
		StockMarketCalculatorInt.calculateBestProfit(stockPrices);
	}

	@Test
	public void testCalculateBestProfitNegative() throws Exception {
		exceptionRule.expect(InputValidationExcetion.class);
		exceptionRule.expectMessage("Negative value");
		BigDecimal[] stockPrices = {new BigDecimal(1.1), new BigDecimal(2.2), new BigDecimal(-3.3)};
		StockMarketCalculatorBigDecimal.calculateBestProfit(stockPrices);
	}

	@Test
	public void testCalculateBestProfitTooManyIndices() throws Exception {
		exceptionRule.expect(InputValidationExcetion.class);
		exceptionRule.expectMessage("Too many indices");
		BigDecimal[] stockPrices = {new BigDecimal(1), new BigDecimal(2), new BigDecimal(3), new BigDecimal(4), new BigDecimal(5), new BigDecimal(6), new BigDecimal(7), new BigDecimal(8), new BigDecimal(9), new BigDecimal(10),
				new BigDecimal(11), new BigDecimal(12), new BigDecimal(13), new BigDecimal(14), new BigDecimal(15), new BigDecimal(16), new BigDecimal(17), new BigDecimal(18), new BigDecimal(19), new BigDecimal(20),
				new BigDecimal(21), new BigDecimal(22), new BigDecimal(23), new BigDecimal(24), new BigDecimal(25), new BigDecimal(26), new BigDecimal(27), new BigDecimal(28), new BigDecimal(29), new BigDecimal(30),
				new BigDecimal(31), new BigDecimal(32), new BigDecimal(33), new BigDecimal(34), new BigDecimal(35), new BigDecimal(36), new BigDecimal(37), new BigDecimal(38), new BigDecimal(39), new BigDecimal(40),
				new BigDecimal(41), new BigDecimal(42), new BigDecimal(43), new BigDecimal(44), new BigDecimal(45), new BigDecimal(46), new BigDecimal(47), new BigDecimal(48), new BigDecimal(49), new BigDecimal(50),
				new BigDecimal(51), new BigDecimal(52), new BigDecimal(53), new BigDecimal(54), new BigDecimal(55), new BigDecimal(56), new BigDecimal(57), new BigDecimal(58), new BigDecimal(59), new BigDecimal(60),
				new BigDecimal(61), new BigDecimal(62), new BigDecimal(63), new BigDecimal(64), new BigDecimal(65), new BigDecimal(66), new BigDecimal(67), new BigDecimal(68), new BigDecimal(69), new BigDecimal(70),
				new BigDecimal(71), new BigDecimal(72), new BigDecimal(73), new BigDecimal(74), new BigDecimal(75), new BigDecimal(76), new BigDecimal(77), new BigDecimal(78), new BigDecimal(79), new BigDecimal(80),
				new BigDecimal(81), new BigDecimal(82), new BigDecimal(83), new BigDecimal(84), new BigDecimal(85), new BigDecimal(86), new BigDecimal(87), new BigDecimal(88), new BigDecimal(89), new BigDecimal(90),
				new BigDecimal(91), new BigDecimal(92), new BigDecimal(93), new BigDecimal(94), new BigDecimal(95), new BigDecimal(96), new BigDecimal(97), new BigDecimal(98), new BigDecimal(99), new BigDecimal(100),
				new BigDecimal(101), new BigDecimal(102), new BigDecimal(103), new BigDecimal(104), new BigDecimal(105), new BigDecimal(106), new BigDecimal(107), new BigDecimal(108), new BigDecimal(109), new BigDecimal(110),
				new BigDecimal(111), new BigDecimal(112), new BigDecimal(113), new BigDecimal(114), new BigDecimal(115), new BigDecimal(116), new BigDecimal(117), new BigDecimal(118), new BigDecimal(119), new BigDecimal(120),
				new BigDecimal(121), new BigDecimal(122), new BigDecimal(123), new BigDecimal(124), new BigDecimal(125), new BigDecimal(126), new BigDecimal(127), new BigDecimal(128), new BigDecimal(129), new BigDecimal(130),
				new BigDecimal(131), new BigDecimal(132), new BigDecimal(133), new BigDecimal(134), new BigDecimal(135), new BigDecimal(136), new BigDecimal(137), new BigDecimal(138), new BigDecimal(139), new BigDecimal(140),
				new BigDecimal(141), new BigDecimal(142), new BigDecimal(143), new BigDecimal(144), new BigDecimal(145), new BigDecimal(146), new BigDecimal(147), new BigDecimal(148), new BigDecimal(149), new BigDecimal(150),
				new BigDecimal(151), new BigDecimal(152), new BigDecimal(153), new BigDecimal(154), new BigDecimal(155), new BigDecimal(156), new BigDecimal(157), new BigDecimal(158), new BigDecimal(159), new BigDecimal(160),
				new BigDecimal(161), new BigDecimal(162), new BigDecimal(163), new BigDecimal(164), new BigDecimal(165), new BigDecimal(166), new BigDecimal(167), new BigDecimal(168), new BigDecimal(169), new BigDecimal(170),
				new BigDecimal(171), new BigDecimal(172), new BigDecimal(173), new BigDecimal(174), new BigDecimal(175), new BigDecimal(176), new BigDecimal(177), new BigDecimal(178), new BigDecimal(179), new BigDecimal(180),
				new BigDecimal(181), new BigDecimal(182), new BigDecimal(183), new BigDecimal(184), new BigDecimal(185), new BigDecimal(186), new BigDecimal(187), new BigDecimal(188), new BigDecimal(189), new BigDecimal(190),
				new BigDecimal(191), new BigDecimal(192), new BigDecimal(193), new BigDecimal(194), new BigDecimal(195), new BigDecimal(196), new BigDecimal(197), new BigDecimal(198), new BigDecimal(199), new BigDecimal(200),
				new BigDecimal(201), new BigDecimal(202), new BigDecimal(203), new BigDecimal(204), new BigDecimal(205), new BigDecimal(206), new BigDecimal(207), new BigDecimal(208), new BigDecimal(209), new BigDecimal(210),
				new BigDecimal(211), new BigDecimal(212), new BigDecimal(213), new BigDecimal(214), new BigDecimal(215), new BigDecimal(216), new BigDecimal(217), new BigDecimal(218), new BigDecimal(219), new BigDecimal(220),
				new BigDecimal(221), new BigDecimal(222), new BigDecimal(223), new BigDecimal(224), new BigDecimal(225), new BigDecimal(226), new BigDecimal(227), new BigDecimal(228), new BigDecimal(229), new BigDecimal(230),
				new BigDecimal(231), new BigDecimal(232), new BigDecimal(233), new BigDecimal(234), new BigDecimal(235), new BigDecimal(236), new BigDecimal(237), new BigDecimal(238), new BigDecimal(239), new BigDecimal(240),
				new BigDecimal(241), new BigDecimal(242), new BigDecimal(243), new BigDecimal(244), new BigDecimal(245), new BigDecimal(246), new BigDecimal(247), new BigDecimal(248), new BigDecimal(249), new BigDecimal(250),
				new BigDecimal(251), new BigDecimal(252), new BigDecimal(253), new BigDecimal(254), new BigDecimal(255), new BigDecimal(256), new BigDecimal(257), new BigDecimal(258), new BigDecimal(259), new BigDecimal(260),
				new BigDecimal(261), new BigDecimal(262), new BigDecimal(263), new BigDecimal(264), new BigDecimal(265), new BigDecimal(266), new BigDecimal(267), new BigDecimal(268), new BigDecimal(269), new BigDecimal(270),
				new BigDecimal(271), new BigDecimal(272), new BigDecimal(273), new BigDecimal(274), new BigDecimal(275), new BigDecimal(276), new BigDecimal(277), new BigDecimal(278), new BigDecimal(279), new BigDecimal(280),
				new BigDecimal(281), new BigDecimal(282), new BigDecimal(283), new BigDecimal(284), new BigDecimal(285), new BigDecimal(286), new BigDecimal(287), new BigDecimal(288), new BigDecimal(289), new BigDecimal(290),
				new BigDecimal(291), new BigDecimal(292), new BigDecimal(293), new BigDecimal(294), new BigDecimal(295), new BigDecimal(296), new BigDecimal(297), new BigDecimal(298), new BigDecimal(299), new BigDecimal(300),
				new BigDecimal(301), new BigDecimal(302), new BigDecimal(303), new BigDecimal(304), new BigDecimal(305), new BigDecimal(306), new BigDecimal(307), new BigDecimal(308), new BigDecimal(309), new BigDecimal(310),
				new BigDecimal(311), new BigDecimal(312), new BigDecimal(313), new BigDecimal(314), new BigDecimal(315), new BigDecimal(316), new BigDecimal(317), new BigDecimal(318), new BigDecimal(319), new BigDecimal(320),
				new BigDecimal(321), new BigDecimal(322), new BigDecimal(323), new BigDecimal(324), new BigDecimal(325), new BigDecimal(326), new BigDecimal(327), new BigDecimal(328), new BigDecimal(329), new BigDecimal(330),
				new BigDecimal(331), new BigDecimal(332), new BigDecimal(333), new BigDecimal(334), new BigDecimal(335), new BigDecimal(336), new BigDecimal(337), new BigDecimal(338), new BigDecimal(339), new BigDecimal(340),
				new BigDecimal(341), new BigDecimal(342), new BigDecimal(343), new BigDecimal(344), new BigDecimal(345), new BigDecimal(346), new BigDecimal(347), new BigDecimal(348), new BigDecimal(349), new BigDecimal(350),
				new BigDecimal(351), new BigDecimal(352), new BigDecimal(353), new BigDecimal(354), new BigDecimal(355), new BigDecimal(356), new BigDecimal(357), new BigDecimal(358), new BigDecimal(359), new BigDecimal(360),
				new BigDecimal(361)};
		StockMarketCalculatorBigDecimal.calculateBestProfit(stockPrices);
	}

	@Test
	public void testCalculateMinimumLoss() throws Exception {
		BigDecimal[] stockPrices = {new BigDecimal(100.0), new BigDecimal(90.90), new BigDecimal(85.85), new BigDecimal(70.70), new BigDecimal(50.50), new BigDecimal(20.20)};
		BigDecimal profit = StockMarketCalculatorBigDecimal.calculateBestProfit(stockPrices);
		assertEquals(new BigDecimal(-5.05).setScale(2, RoundingMode.HALF_UP), profit);
	}


}
