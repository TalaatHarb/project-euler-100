use crate::{Runable, Solvable};
use num_bigint::BigUint;
use num_traits::Zero;

const P013_DATA: &str = include_str!("p013.txt");

pub struct P013;
impl Solvable for P013 {
    fn problem_name(&self) -> &str { "p013" }
    fn solve(&self) -> i64 {
        let sum: BigUint = P013_DATA.trim().lines()
            .map(|line| line.trim().parse::<BigUint>().unwrap())
            .fold(BigUint::zero(), |acc, n| acc + n);
        let s = sum.to_string();
        s[..10].parse().unwrap()
    }
}
impl Runable for P013 {}
